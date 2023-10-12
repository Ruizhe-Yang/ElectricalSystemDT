package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import base.ModelElement;

public class PerformQueryActionEMF implements IExternalJavaAction {

	public PerformQueryActionEMF() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		ModelElement cp = (ModelElement) focus;
		
		cp.getExternalReference().getImplementationConstraint().get(1).getContent().getValue().get(0).setContent("Query Result");
//		cp.getImplementationConstraint().get(3).getContent().getValue().get(0).setContent("Query Result");
		
		String doc_path = cp.getExternalReference().getLocation().getContent();
		String metadata_path = cp.getExternalReference().getMetadata().getContent();
		//assuming EMF models for now
		String constraint = cp.getExternalReference().getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
		String result = "Query Result";
		try {
			result = UtilityMethods.executeQuery(doc_path, metadata_path, constraint);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cp.getExternalReference().getImplementationConstraint().get(1).getContent().getValue().get(0).setContent(result);
//		cp.getImplementationConstraint().get(3).getContent().getValue().get(0).setContent(result);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
