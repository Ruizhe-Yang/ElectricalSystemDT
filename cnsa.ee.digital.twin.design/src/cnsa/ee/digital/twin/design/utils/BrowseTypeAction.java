package cnsa.ee.digital.twin.design.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import base.ModelElement;
import component.Component;
import component.ComponentPackage;
import digital_twin.DigitalTwinPackage;
import terminology.Term;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;


public class BrowseTypeAction implements IExternalJavaAction{

	private Component focus = null;
	private HashMap<String, ModelElement> map = new HashMap<String, ModelElement>();
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Component cp = null;
		for(EObject obj: selections) {
			cp = (Component) obj;
			focus = cp;
		}
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getDefault().getActiveShell(), new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});
		
		dialog.setTitle(cp.getComponent_name());
		dialog.setElements(getTerms(cp).toArray());
		if (dialog.open() == Window.OK) {
			if (dialog.getResult().length > 0) {
				selectionChanged((String) dialog.getResult()[0]);
			}
		}
	}
	
	protected void selectionChanged(String selection) {
		Term t = (Term) map.get(selection);
		focus.setBlockType(t);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}
	
	protected ArrayList<String> getTerms(Component cp) {
		ModelElement container = (ModelElement) cp.eContainer();
		while (container.eContainer() != null && !(container instanceof ComponentPackage)) {
			container = (ModelElement) container.eContainer();
		}
		ComponentPackage cpkg = (ComponentPackage) container;
		DigitalTwinPackage mbsapkg = (DigitalTwinPackage) cpkg.eContainer();
		ArrayList<String> ret = new ArrayList<>();
		for(TerminologyPackage rp :mbsapkg.getTerminologyPackages()) {
			for(TerminologyElement te: rp.getTerminologyElement()) {
				if(te instanceof Term) {
					Term t = (Term) te;
					map.put(t.getName().getContent(), t);
					ret.add(t.getName().getContent());
				}
			}
		}
		return ret;
	}

}
