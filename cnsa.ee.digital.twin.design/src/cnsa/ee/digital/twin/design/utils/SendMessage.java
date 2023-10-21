package cnsa.ee.digital.twin.design.utils;


//引用各种库
import java.io.File;
import java.util.Collection;
import java.util.Map;

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
import cnsa.ee.digital.twin.design.com.net.Client;
import component.Component;


public class SendMessage implements IExternalJavaAction {
	//声明函数
	public SendMessage() {
	}
	//执行步骤
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
				System.out.println("comp.getName:" + comp.getName());
				Client client = new Client();
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
