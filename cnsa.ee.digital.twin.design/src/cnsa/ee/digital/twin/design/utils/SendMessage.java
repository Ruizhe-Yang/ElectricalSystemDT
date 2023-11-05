package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import base.ModelElement;
import cnsa.ee.digital.twin.design.com.net.ClientTest;
import component.Component;


public class SendMessage implements IExternalJavaAction {
	
	public SendMessage() {
	}
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		
		ModelElement cp = (ModelElement) focus;
		
		if(cp instanceof Component) {
			Component comp = (Component) cp;
			if (comp.isDynamic()) {
				String gid = comp.getGid();
				System.out.println("comp.getName:" + comp.getName().getContent());
				ClientTest client = new ClientTest();
				client.connect();
				client.send(gid);
				client.disconnect();
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
