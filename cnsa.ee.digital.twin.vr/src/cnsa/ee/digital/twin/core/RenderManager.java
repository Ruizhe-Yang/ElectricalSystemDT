package cnsa.ee.digital.twin.core;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import cnsa.ee.digital.twin.entity.Model;
import cnsa.ee.digital.twin.launch.Launcher;
import cnsa.ee.digital.twin.utils.Utils;

public class RenderManager {

	private final GWindow window;
	private ShaderManager shader;
	
	public RenderManager() {
		window = Launcher.getWindow();
	}
	
	public void init() throws Exception {
		shader = new ShaderManager();
		shader.createVertexShader(Utils.loadResource("vertex.vs"));
		shader.createFragmentShader(Utils.loadResource("fragment.fs"));
		shader.link();
	}
	
	public void render(Model model) {
		clear();
		shader.bind();
		
		GL30.glBindVertexArray(model.getId());
		GL20.glEnableVertexAttribArray(0);
		GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, model.getVertexCount());
		GL20.glDisableVertexAttribArray(0);
		GL30.glBindVertexArray(0);
		
		shader.unbind();
	}
	
	public void clear() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}
	
	public void cleanup() {
		shader.cleanup();
	}
}
