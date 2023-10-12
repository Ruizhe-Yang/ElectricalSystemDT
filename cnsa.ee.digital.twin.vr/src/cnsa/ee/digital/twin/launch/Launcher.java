package cnsa.ee.digital.twin.launch;

import cnsa.ee.digital.twin.core.EngineManager;
import cnsa.ee.digital.twin.core.GWindow;
import cnsa.ee.digital.twin.test.TestGame;
import cnsa.ee.digital.twin.utils.Consts;

public class Launcher {
	public static GWindow window;
	private static TestGame game;
	
	public static void main(String[] args) {
		window = new GWindow(Consts.TITLE, 1600, 900, false);
		game = new TestGame();
		EngineManager engine = new EngineManager();
		try {
			engine.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static GWindow getWindow() {
		return window;
	}
	
	public static TestGame getGame() {
		return game;
	}
}
