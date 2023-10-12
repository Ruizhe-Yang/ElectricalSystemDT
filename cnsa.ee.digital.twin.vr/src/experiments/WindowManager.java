package experiments;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class WindowManager {

	private int width, height;
	private String title;
	private long window;
	public int frames;
	public long time;
	public Input input;
	private float backgroundR, backgroundG, backgroundB;
	private GLFWWindowSizeCallback sizeCallback;
	private boolean isResized;
	private boolean isFullScreen;
	private int[] windowPosX = new int[1], windowPosY = new int[1];
	
	public WindowManager(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	public void create() {
		if(!GLFW.glfwInit())
		{
			System.err.print("Initialisation Failed");
			return;
		}
		input = new Input();
		window = GLFW.glfwCreateWindow(width, height, title, isFullScreen? GLFW.glfwGetPrimaryMonitor(): 0, 0);
		
		if(window == 0) {
			System.err.print("ERROR: Window failed to create");
			return;
		}
		
		GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		windowPosX[0] = (videoMode.width()-width)/2;
		windowPosY[0] = (videoMode.height()-height)/2;
		GLFW.glfwSetWindowPos(window, windowPosX[0], windowPosY[0]);

		//make the window current 
		GLFW.glfwMakeContextCurrent(window);
		//supports OPEN GL
		GL.createCapabilities();
		
		//enable 3d Depth test
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		
		createCallBacks();
		
		GLFW.glfwShowWindow(window);
		
		GLFW.glfwSwapInterval(1);//60 frames per second
		
		time = System.currentTimeMillis();
	}
	
	public void update() {
		//handles resize
		if (isResized) {
			GL11.glViewport(0, 0, width, height);
			isResized = false;
			if (isFullScreen) {
				GLFW.glfwGetWindowPos(window, windowPosX, windowPosY);
				GLFW.glfwSetWindowMonitor(window, GLFW.glfwGetPrimaryMonitor(), 0, 0, width, height, 0);
			}
			else {
				GLFW.glfwSetWindowMonitor(window, 0, windowPosX[0], windowPosY[0], width, height, 0);
			}
		}
		
		GL11.glClearColor(backgroundR, backgroundG, backgroundB, 1.0f);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		
		GLFW.glfwPollEvents();
		frames++;
		if(System.currentTimeMillis() > time + 1000) {
			GLFW.glfwSetWindowTitle(window, title + " |FPS: " +frames);
			time = System.currentTimeMillis();
			frames = 0;
		}
	}
	
	private void createCallBacks() {
		sizeCallback = new GLFWWindowSizeCallback() {
			
			@Override
			public void invoke(long window, int w, int h) {
				width = w;
				height = h;
				isResized = true;
			}
		};
		
		//input call backs
		GLFW.glfwSetKeyCallback(window, input.getKeyboardCallback());
		GLFW.glfwSetCursorPosCallback(window, input.getMouse());
		GLFW.glfwSetMouseButtonCallback(window, input.getMouseButtonCallback());
		GLFW.glfwSetScrollCallback(window, input.getMouseScrollCallback());
		GLFW.glfwSetWindowSizeCallback(window, sizeCallback);
	}
	
	public void destroy() {
		input.destroy();
		sizeCallback.free();
		GLFW.glfwWindowShouldClose(window);
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
	}
	
	public void swapBuffers() {
		GLFW.glfwSwapBuffers(window);
	}
	
	public boolean shouldCloseWindow() {
		return GLFW.glfwWindowShouldClose(window);
	}
	
	public static void main(String[] args) {
		WindowManager manager = new WindowManager(1920, 1080, "Hello");
		manager.create();
	}
	
	public void setBackgroundColor(float r, float g, float b) {
		backgroundR = r;
		backgroundG = g;
		backgroundB = b;
	}

	public boolean isFullScreen() {
		return isFullScreen;
	}

	public void setFullScreen(boolean isFullScreen) {
		this.isFullScreen = isFullScreen;
		isResized = true;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getTitle() {
		return title;
	}

	public long getWindow() {
		return window;
	}
	
}
