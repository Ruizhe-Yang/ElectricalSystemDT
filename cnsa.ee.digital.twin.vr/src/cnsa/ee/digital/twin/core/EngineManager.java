package cnsa.ee.digital.twin.core;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

import cnsa.ee.digital.twin.launch.Launcher;
import cnsa.ee.digital.twin.utils.Consts;

public class EngineManager {

	public static final long NANOSECOND = 1000000000L;
	public static final float FRAMERATE = 1000;
	
	private static int fps;
	private static float frametime = 1.0f/FRAMERATE;
	
	private boolean isRunning;
	
	private GWindow window;
	private GLFWErrorCallback errorCallback;
	private ILogic gameLogic;
	
	private void init() throws Exception {
		GLFW.glfwSetErrorCallback(errorCallback = GLFWErrorCallback.createPrint(System.err));
		window = Launcher.getWindow();
		gameLogic = Launcher.getGame();
		window.init();
		gameLogic.init();
	}
	
	public void start() throws Exception {
		init();
		if(isRunning)
			return;
		run();
	}
	
	public void run() {
		this.isRunning = true;
		int frames = 0;
		long frameCounter = 0;
		long lastTime = System.nanoTime();
		double uprocessedTime = 0;
		
		while(isRunning) {
			boolean render = false;
			long startTime = System.nanoTime();
			long passedTime = startTime - lastTime;
			lastTime = startTime;
			
			uprocessedTime += passedTime /(double) NANOSECOND;
			frameCounter += passedTime;
			
			//input
			input();
			
			while(uprocessedTime > frametime) {
				render = true;
				uprocessedTime -= frametime;
				if(window.windowShouldClose())
					stop();
				
				if(frameCounter >= NANOSECOND) {
					setFps(frames);
					window.setTitle(Consts.TITLE + getFps());
					frames = 0;
					frameCounter = 0;
				}
			}
			
			if(render) {
				update();
				render();
				frames++;
			}
		}
		cleanup();
	}
	
	public void stop() {
		if(!isRunning)
			return;
		isRunning = false;
	}
	
	public void input() {
		gameLogic.input();
	}
	
	public void render() {
		gameLogic.render();
		window.update();
	}

	public void update() {
		gameLogic.update();
	}
	
	public void cleanup() {
		window.cleanup();
		gameLogic.cleanup();
		errorCallback.free();
		GLFW.glfwTerminate();
	}
	
	public static int getFps() {
		return fps;
	}
	
	public static void setFps(int fps) {
		EngineManager.fps = fps;
	}
	
	public static float getFrametime() {
		return frametime;
	}
	
}
