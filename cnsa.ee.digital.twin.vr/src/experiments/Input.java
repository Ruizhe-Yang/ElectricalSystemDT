package experiments;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCursorPosCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallback;
import org.lwjgl.glfw.GLFWScrollCallback;

public class Input {
	//all keys possible
	private static boolean[] keys = new boolean[GLFW.GLFW_KEY_LAST];
	private static boolean[] mouseButtons = new boolean[GLFW.GLFW_MOUSE_BUTTON_LAST];
	private static double mouseX, mouseY;
	private static double scrollX, scrollY;
	
	private GLFWKeyCallback keyboardCallback;
	private GLFWCursorPosCallback mouse;
	private GLFWMouseButtonCallback mouseButtonCallback;
	private GLFWScrollCallback mouseScrollCallback;
	
	public Input() {
		keyboardCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				keys[key] = (action != GLFW.GLFW_RELEASE);
			}
		};
		
		mouse = new GLFWCursorPosCallback() {
			
			@Override
			public void invoke(long window, double xPos, double yPos) {
				mouseX = xPos;
				mouseY = yPos;
			}
		};
		mouseButtonCallback = new GLFWMouseButtonCallback() {
			
			@Override
			public void invoke(long window, int button, int action, int mods) {
				mouseButtons[button] = (action != GLFW.GLFW_RELEASE);
			}
		};
		mouseScrollCallback = new GLFWScrollCallback() {
			
			@Override
			public void invoke(long window, double offsetX, double offsetY) {
				scrollX += offsetX;
				scrollY += offsetY;
			}
		};
	}
	
	public static boolean isKeyDown(int key) {
		return keys[key];
	}
	
	public static boolean isMouseButtonDown(int button) {
		return mouseButtons[button];
	}
	
	public void destroy() {
		keyboardCallback.free();
		mouseButtonCallback.free();
		mouse.free();
		mouseScrollCallback.free();
	}
	
	public GLFWKeyCallback getKeyboardCallback() {
		return keyboardCallback;
	}

	public void setKeyboard(GLFWKeyCallback keyboardCallback) {
		this.keyboardCallback = keyboardCallback;
	}

	public static double getMouseX() {
		return mouseX;
	}

	public static double getMouseY() {
		return mouseY;
	}
	
	public static double getScrollX() {
		return scrollX;
	}
	
	public static double getScrollY() {
		return scrollY;
	}

	public GLFWCursorPosCallback getMouse() {
		return mouse;
	}

	public GLFWMouseButtonCallback getMouseButtonCallback() {
		return mouseButtonCallback;
	}
	
	public GLFWScrollCallback getMouseScrollCallback() {
		return mouseScrollCallback;
	}
	
}
