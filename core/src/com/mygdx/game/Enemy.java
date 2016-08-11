package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Ryan on 8/9/2016.
 */
public class Enemy {
    private static AssetManager manager;
    private Vector2 position, velocity;
    private Rectangle bounds;
    public Sprite sprite;

    static {
        //memory management -- loading image into manager
        String image = "images/badlogic.jpg";
        manager = new AssetManager();
        manager.load(image, Texture.class);
        manager.finishLoading();
    }

    public Enemy(float x, float y) {
        sprite = new Sprite(manager.get("images/badlogic.jpg", Texture.class));
        //sprite.setSize(YOUR WIDTH, YOUR HEIGHT);
        sprite.setScale(sprite.getWidth(), sprite.getHeight());
        position = new Vector2(x, y);
        velocity = new Vector2(0, 50); //TODO: change this value
        bounds = new Rectangle(getPosition().x, getPosition().y, sprite.getWidth(), sprite.getHeight());
    }

    public void move() {setPosition(getPosition().x, getPosition().y - getVelocity().y);}
    public void draw(SpriteBatch batch) {batch.draw(sprite, getPosition().x, getPosition().y, sprite.getWidth(), sprite.getHeight());}
    public void setPosition(float x, float y) {position.set(x, y);}
    public Vector2 getPosition() {return position;}
    public void setVelocity(float x, float y) {velocity.set(x, y);}
    public Vector2 getVelocity() {return velocity;}
    public void setBounds() {bounds.set(getPosition().x, getPosition().y, sprite.getWidth(), sprite.getHeight());}
    public Rectangle getBounds() {return bounds;}
}
