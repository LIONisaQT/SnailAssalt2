package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SnailAssalt2 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	protected enum GameState {MAIN_MENU, LEVEL_SELECT, CHARACTER_SELECT, IN_GAME, GAME_OVER, STORE, SETTINGS}
	protected static GameState state;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		reset();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		update();
		draw();
	}

	public void reset () {
		state = GameState.MAIN_MENU;
	}

	public void update() {
		switch(state) {
			case MAIN_MENU:
				//code here
				break;
			case LEVEL_SELECT:
				//code here
				break;
			case CHARACTER_SELECT:
				//code here
				break;
			case IN_GAME:
				//code here
				break;
			case GAME_OVER:
				//code here
				break;
			case STORE:
				//code here
				break;
			case SETTINGS:
				//code here
				break;
			default:
				//I don't think we need to put anything here
				break;
		}
	}

	public void draw () {
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
