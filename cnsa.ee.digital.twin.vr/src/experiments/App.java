package experiments;

import org.lwjgl.glfw.GLFW;

public class App implements Runnable{

	public Thread app;
	public static WindowManager windowManager;
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	
	
	public static void init() {
		System.out.println("Initialising App");
		windowManager = new WindowManager(WIDTH, HEIGHT, "App");
		windowManager.setBackgroundColor(1.0f, 1.0f, 0.5f);
		windowManager.setFullScreen(false);
		windowManager.create();
	}

	public void start() {
		app = new Thread(this, "app");
		app.start();
	}
	
	@Override
	public void run() {
		init();
		while (!windowManager.shouldCloseWindow() && !Input.isKeyDown(GLFW.GLFW_KEY_ESCAPE)) {
			update();
			render();
			if (Input.isKeyDown(GLFW.GLFW_KEY_F11)) {
				windowManager.setFullScreen(!windowManager.isFullScreen());
			}
		}
		windowManager.destroy();
	}
	
	private void update() {
		windowManager.update();
		if (Input.isMouseButtonDown(GLFW.GLFW_MOUSE_BUTTON_LEFT)) {
			//System.out.println("X: " + Input.getMouseX() + ", Y: "+ Input.getMouseY());
			System.out.println("ScrollX: " + Input.getScrollX() + ", ScrollY: "+ Input.getScrollY());
		}
	}
	
	private void render() {
//		System.out.println("Rendering app");
		windowManager.swapBuffers();
	}
	
	public static void main(String[] args) {
		new App().start();
	}
}
