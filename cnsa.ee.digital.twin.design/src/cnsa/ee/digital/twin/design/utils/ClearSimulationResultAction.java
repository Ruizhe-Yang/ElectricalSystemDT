package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import base.ModelElement;

public class ClearSimulationResultAction implements IExternalJavaAction {

	public ClearSimulationResultAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		ModelElement cp = (ModelElement) focus;
		
		cp.getExternalReference().getImplementationConstraint().get(3).getContent().getValue().get(0).setContent("");
//		cp.getImplementationConstraint().get(3).getContent().getValue().get(0).setContent("");

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
