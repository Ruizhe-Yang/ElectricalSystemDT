package cnsa.ee.digital.twin.design.utils;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.simulink.model.SimulinkModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.emf.common.util.URI;

import base.ModelElement;
import component.Component;
import component.ComponentPackage;
import component.Component_Package;

public class ImportSimulinkAction implements IExternalJavaAction {

	public ImportSimulinkAction() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		UtilityMethods.openDiagram("CP2");

		
//		FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell());
//		fileDialog.setText("Locate file");
//		fileDialog.setFilterPath(getProjectPath());
//		String path = fileDialog.open();
//		if (path == null) {
//			return;
//		}
//		
//		EObject focus = null;
//		for(EObject eobj: selections) {
//			focus = eobj;
//		}
//		ModelElement modelElement = (ModelElement) focus;
//		Component comp = transform(path);
//		if(modelElement instanceof ComponentPackage) {
//			ComponentPackage cp = (ComponentPackage) modelElement;
//			cp.getComponents().add(comp);
//		}
//		else if (modelElement instanceof Component) {
//			Component cp = (Component) modelElement;
//			cp.getSub_components().add(comp);
//		}
//		
//		System.out.println("Yangruizhe to validate");

	}
	
	private String getProjectPath() {
	    IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         return project.getFullPath().toOSString();
		      }
		   }
		   else {
			  return project.getFullPath().toOSString();
		   }
		}
		return null;
	}

	public Component transform(String path) {
		Component component = null;
		SimulinkModel source = null;;
		try {
			source = UtilityMethods.createAndLoadSimulinkMode(path, "S", "true", "false");
		} catch (EolModelLoadingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		EmfModel target = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		try {
			Component_Package.eINSTANCE.eClass();
			Registry reg = Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("component", new XMIResourceFactoryImpl());
			Resource resource = null;
			try {
				String p = UtilityMethods.getSimu2EmfMode();
				resource = resourceSet.getResource(URI.createFileURI(p), true);
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				target = UtilityMethods.loadInMemoryEMFModel(
						"T",
						"false",
						"true",
						resource,
						"http://cnsa.ee.digital.twin/base",
						"http://cnsa.ee.digital.twin/artifact",
						"http://cnsa.ee.digital.twin/digital_twin",
						"http://cnsa.ee.digital.twin/component",
						"http://cnsa.ee.digital.twin/terminology");
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ArrayList<IModel> list = new ArrayList();
			list.add(source);
			list.add(target);
			try {
				UtilityMethods.doEOLTransformation(list, UtilityMethods.getSimu2Emf().getPath());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			component = (Component) target.getModelImpl().getContents().get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return component;
	}
	
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
