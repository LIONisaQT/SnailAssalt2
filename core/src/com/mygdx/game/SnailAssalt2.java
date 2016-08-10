package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SnailAssalt2 extends Game {
	public SpriteBatch batch;
    public BitmapFont font;

	protected enum GameState {MAIN_MENU, LEVEL_SELECT, CHARACTER_SELECT, IN_GAME, GAME_OVER, STORE, SETTINGS}
	protected static GameState state;

	protected static Preferences preferences;

	@Override
	public void create () {
		batch = new SpriteBatch();
        preferences = new Preferences("Preferences");
		reset();
	}

	@Override
	public void render () {
        super.render();
	}

	public void reset () {
        this.setScreen(new MainMenuScreen(this));
	}

	public void update() throws IllegalStateException {
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
				throw new IllegalStateException("Somehow not in any of intended game states");
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
        font.dispose();
	}
}
