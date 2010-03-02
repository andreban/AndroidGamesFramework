package com.mobplug.android.games.framework;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.mobplug.games.framework.BaseGameRunnable;
import com.mobplug.games.framework.interfaces.Game;
import com.mobplug.games.framework.interfaces.GameRenderer;
import com.mobplug.games.framework.interfaces.GameRunnable;

public abstract class GameSurfaceView2D extends SurfaceView implements SurfaceHolder.Callback {
	private GameRunnable gameRunnable;
	
	public GameSurfaceView2D(Context context) {
		super(context);
		init();
	}

	public GameSurfaceView2D(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();		
	}

	public GameSurfaceView2D(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();		
	}
	
	private void init() {
		gameRunnable = new BaseGameRunnable(getRenderer(), getGame());
	}
	@Override
	public void surfaceChanged(SurfaceHolder holder, int type, int width, int height) {
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		
	}
	
	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		getGame().stop();
	}
	
	public abstract Game getGame();
	public abstract GameRenderer getRenderer();		
}
