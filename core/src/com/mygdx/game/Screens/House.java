package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by ryan on 9/27/16.
 */
public class House {
    private static AssetManager manager;
    private static String image = "badlogic.jpg"; //holds directory of image
    private Vector2 position;
    private Rectangle bounds;
    public Sprite sprite;
    private float hp;

    static { //this might need to me removed later
        //memory management -- loading image into manager
        manager = new AssetManager();
        manager.load(image, Texture.class);
        manager.finishLoading();
    }

    public House() {
        sprite = new Sprite(manager.get(image, Texture.class));
        sprite.setSize(Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight());
        sprite.setScale(sprite.getWidth(), sprite.getHeight());
        position = new Vector2(Gdx.graphics.getWidth() / 5, 0);
        bounds = new Rectangle(getPosition().x, getPosition().y, sprite.getWidth(), sprite.getHeight());
        setHp(1000);
        hp = getHp();
    }

    public void setHp(float hit) {hp = hit;}
    public float getHp() {return hp;}
    public void draw(SpriteBatch batch) {batch.draw(sprite, getPosition().x, getPosition().y, sprite.getWidth(), sprite.getHeight());}
    public void setPosition(float x, float y) {position.set(x, y);}
    public Vector2 getPosition() {return position;}
    public void setBounds() {bounds.set(getPosition().x, getPosition().y, sprite.getWidth(), sprite.getHeight());}
    public Rectangle getBounds() {return bounds;}
}
