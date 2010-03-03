package com.mobplug.android.games.framework;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import com.mobplug.games.framework.BaseGameRunnable;
import com.mobplug.games.framework.interfaces.Game;
import com.mobplug.games.framework.interfaces.GameRunnable;

public abstract class GameSurfaceView3D<G extends Game> extends GLSurfaceView {
	protected GameRunnable gameRunnable;
	
	public GameSurfaceView3D(Context context) {
		super(context);
		AndroidGameRenderer3D<G> renderer = getRenderer(this);
		G game = getGame();
		gameRunnable = new BaseGameRunnable<G>(renderer, game);
	}

	public GameSurfaceView3D(Context context, AttributeSet attrs) {
		super(context, attrs);
		AndroidGameRenderer3D<G> renderer = getRenderer(this);
		G game = getGame();
		gameRunnable = new BaseGameRunnable<G>(renderer, game);
	}	

	protected abstract G getGame();
	protected abstract AndroidGameRenderer3D<G> getRenderer(GameSurfaceView3D<G> surface);
}
