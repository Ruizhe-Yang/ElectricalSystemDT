package cnsa.ee.digital.twin.design.utils;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import base.ModelElement;
import cnsa.ee.digital.twin.design.com.net.MultiServer;
import component.Component;
import component.Output;


public class StopReceivingMessage implements IExternalJavaAction {
	public StopReceivingMessage() {
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
			MultiServer multiServers= MultiServer.getInstance();
			String gid = component.getGid();
			String port = findFirstFourNumbers(gid);
			if (MultiServer.port_map.containsKey(port)) {
				System.out.println("端口 " + port + " 关闭成功。");
				multiServers.closeThread(Integer.parseInt(port));
			}
			else {
				System.out.println("端口 " + port + " 未开启。");
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

