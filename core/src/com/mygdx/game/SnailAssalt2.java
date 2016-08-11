package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.graphics.OrthographicCamera;


public class SnailAssalt2 extends Game {
	SpriteBatch batch;
    BitmapFont font;
    float deltaTime;
    public static OrthographicCamera camera;
    private static Vector3 tap;

	protected static Preferences preferences;

	@Override
	public void create () {
		batch = new SpriteBatch();
        font = new BitmapFont();
        preferences = new Preferences("Preferences");
        deltaTime = Gdx.graphics.getDeltaTime();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		tap = new Vector3();
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

	public static Vector3 getTapPosition() { //gets and translates coordinates of tap to game world coordinates
		tap.set(Gdx.input.getX(), Gdx.input.getY(), 0);
		return camera.unproject(tap);
	}
}
