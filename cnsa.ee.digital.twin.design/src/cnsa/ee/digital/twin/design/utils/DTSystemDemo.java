package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import base.LangString;
import base.ModelElement;
import cnsa.ee.digital.twin.design.com.net.MultiServerDemo;
import component.Component;
import component.ComponentElement;
import component.ComponentPackage;


public class DTSystemDemo implements IExternalJavaAction {
	public DTSystemDemo() {
	}
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}

		ModelElement cp = (ModelElement) focus;
		if(cp instanceof Component) {
			Component component = (Component) cp;
			System.out.println("Test");
			System.out.println(component.getName().getContent());
//			if (component.isDynamic()) {
//				String gid = component.getGid();
//				String port = findFirstFourNumbers(gid);
//				System.out.println("comp.getName:" + component.getName().getContent());
//				MultiServerDemo multiServersDemo = MultiServerDemo.getInstance();
//				multiServersDemo.createServerThread(Integer.parseInt(port), component);
//			}
			openDiagram(component.getName().getContent());
		}
	}
	
	private static String findFirstFourNumbers(String input) {
        StringBuilder numbers = new StringBuilder();
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
                count++;
            }
            if (count == 4) {
                break;
            }
        }
        return numbers.toString();
    }
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	public static void openDiagram(String langString) {
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		      }
		   }
		   IFile airdFile = project.getFile("representations.aird");
		   URI representationsFileURI = URI.createPlatformResourceURI(airdFile
					.getFullPath().toOSString(), true);
			Session session = SessionManager.INSTANCE.getSession(
					representationsFileURI, new NullProgressMonitor());

			DAnalysis root = (DAnalysis) session.getSessionResource()
					.getContents().get(0);
			EList<DView> views = root.getOwnedViews();
			
			EList<DRepresentationDescriptor> representations = new BasicEList<DRepresentationDescriptor>();
			
			for(DView view: views) {
				representations.addAll(view.getOwnedRepresentationDescriptors());

			}
			DRepresentation representation = null;
			ModelElement modelElement = null;
//			EObject rootObject = null;
			for (DRepresentationDescriptor currentRep : representations) {
				ModelElement temp = (ModelElement) currentRep.getTarget();
				if(temp != null) {
					LangString name = temp.getName();
					if (name != null) {
						String content = name.getContent();
						if (langString.equals(content)) {
							modelElement = temp;
							representation = currentRep.getRepresentation();
						}
						else if(isContainedWithin(temp, langString)) {
							modelElement = temp;
							representation = currentRep.getRepresentation();
						}
					}
				}
			}
			DialectUIManager.INSTANCE.openEditor(session, representation,
					new NullProgressMonitor());
		}
	}
	private static boolean isContainedWithin(ModelElement modelElement, String s) {
		if(modelElement instanceof Component) {
			Component temp = (Component) modelElement;
			for(ComponentElement c: temp.getSub_components()) {
				LangString name = c.getName();
				if (name!= null && name.getContent() != null) {
					if(name.getContent().equals(s)) {
						return true;
					}
				}
			}
		}
		else if(modelElement instanceof ComponentPackage) {
			ComponentPackage temp = (ComponentPackage) modelElement;
			for(ComponentElement c: temp.getComponents()) {
				LangString name = c.getName();
				if (name!= null && name.getContent() != null) {
					if(name.getContent().equals(s)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

