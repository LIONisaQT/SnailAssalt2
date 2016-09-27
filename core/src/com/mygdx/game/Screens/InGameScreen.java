package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.Enemy;
import com.mygdx.game.SnailAssalt2;

import java.util.ArrayList;

/**
 * Created by Ryan on 8/10/2016.
 */
public class InGameScreen implements Screen {
    final SnailAssalt2 game;

    House house;
    ArrayList<Enemy> enemies;

    public InGameScreen(final SnailAssalt2 gam) {
        game = gam;
        house = new House();
        enemies = new ArrayList<Enemy>();
        for (int i = 0; i < 5; i++) {
            enemies.add(new Enemy(0, (float)Math.random() * Gdx.graphics.getHeight()));
        }
    }

    @Override
    public void show() {
        game.batch.begin();
        house.draw(game.batch);
        for (Enemy e : enemies) {
            e.draw(game.batch);
        }
        game.font.getData().setScale(3);
        game.font.draw(game.batch, "IN_GAME", 10, Gdx.graphics.getHeight() - 10);
        game.font.draw(game.batch, "Number of enemies: " + enemies.size(), 10, Gdx.graphics.getHeight() - 60);
        game.batch.end();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        for (Enemy e : enemies) {
            e.move();
            if (e.getPosition().x >= Gdx.graphics.getWidth()) {
                game.setScreen(new GameOverScreen(game));
                dispose();
            }
        }
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
