package cnsa.ee.digital.twin.design.utils;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.simulink.model.SimulinkModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import base.ModelElement;

public class SimulateAction_Simulink implements IExternalJavaAction {

	public SimulateAction_Simulink() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		ModelElement modelElement = (ModelElement) focus;
		
		SimulinkModel source = null;;
		String path = modelElement.getExternalReference().getLocation().getContent();
		String matPath = modelElement.getExternalReference().getMetadata().getContent();
		
		if(matPath == null || matPath.equals("metadata")) {
			matPath = getMatlabPath();
		}
		
		try {
			source = UtilityMethods.createAndLoadSimulinkMode(path, "S", "true", "false");
			source.simulate();
			if(source.getMatlabPath() != null) {
				source.setMatlabPath(matPath);//needs to set path
			}
			
			String s = source.getWorkspaceVariable("simout").toString();
			modelElement.getExternalReference().getImplementationConstraint().get(3).getContent().getValue().get(0).setContent(s);
		} catch (EolModelLoadingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Yangruizhe to validate");

	}
	
	private String getMatlabPath() {
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText("Locate Matlab Path");
		
		//set initial open path
		fileDialog.setFilterPath(getProjectPath());
		//compute path
		String path = fileDialog.open();
		if (path != null) {
			File f = new File(path);
			Path p = new Path(f.getAbsolutePath());
			int segmentCount = p.segmentCount();
			path = File.separator + p.segment(segmentCount-2) + File.separator + p.segment(segmentCount-1);
		}
		return path;
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

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
