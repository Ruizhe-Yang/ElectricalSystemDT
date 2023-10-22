package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import base.ModelElement;
import cnsa.ee.digital.twin.design.com.net.Server;
import component.Component;


public class ReceiveMessage implements IExternalJavaAction {
	
	public ReceiveMessage() {
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
				String port = findFirstFourNumbers(gid);
				System.out.println("comp.getName:" + comp.getName().getContent());
				Server server = new Server();
				server.run(port);
				System.out.println("����������");
			}
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

}