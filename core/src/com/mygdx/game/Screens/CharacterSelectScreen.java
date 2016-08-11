package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.SnailAssalt2;

/**
 * Created by Ryan on 8/10/2016.
 */
public class CharacterSelectScreen implements Screen {
    final SnailAssalt2 game;

    public CharacterSelectScreen(final SnailAssalt2 gam) {
        game = gam;
    }
    @Override
    public void show() {
        game.batch.begin();
        game.font.getData().setScale(3);
        game.font.draw(game.batch, "LEVEL_SELECT", 10, Gdx.graphics.getHeight() - 10);
        game.batch.end();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        show();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
