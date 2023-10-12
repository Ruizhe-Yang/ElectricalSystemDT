package cnsa.ee.digital.twin.design.utils;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Random;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import base.ModelElement;
import component.Component;
import component.Input;
import component.Output;

public class SimulateAction implements IExternalJavaAction {

	public SimulateAction() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		ModelElement cp = (ModelElement) focus;
		
		Random r = new Random();
		
		if(cp instanceof Component) {
			Component comp = (Component) cp;
			
			for(Input i : comp.getInputs()) {
				double d1 = r.nextDouble();
				i.getReading().setValue(d1);
			}
			for(Output i : comp.getOutputs()) {
				double d2 = r.nextDouble();
				i.getReading().setValue(d2);
			}
		}

	}
	

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
