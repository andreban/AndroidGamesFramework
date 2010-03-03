package com.mobplug.android.games.framework;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;

import com.mobplug.games.framework.interfaces.Game;
import com.mobplug.games.framework.interfaces.GameRenderer;

public abstract class AndroidGameRenderer3D<G extends Game> implements GameRenderer<G>, Renderer {

	private GLSurfaceView glSurfaceView;
	protected Game game;
	
	public AndroidGameRenderer3D(GLSurfaceView glSurfaceView, Game game) {
		this.game = game;
		this.glSurfaceView = glSurfaceView;
		glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
	}
	
	@Override
	public void render() {
		glSurfaceView.requestRender();
	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		// TODO Auto-generated method stub
		
	}

}
