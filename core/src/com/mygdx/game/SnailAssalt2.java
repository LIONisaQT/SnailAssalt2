package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SnailAssalt2 extends Game {
	SpriteBatch batch;
    BitmapFont font;
    enum GameState {START, MAIN_MENU, LEVEL_SELECT, CHARACTER_SELECT, IN_GAME, GAME_OVER, STORE, SETTINGS}
	GameState state;

	protected static Preferences preferences;

	@Override
	public void create () {
		batch = new SpriteBatch();
        font = new BitmapFont();
        preferences = new Preferences("Preferences");
        this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
        super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
        font.dispose();
	}
}
