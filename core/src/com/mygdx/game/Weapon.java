package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Gdx;


/**
 * Created by lin on 8/10/16.
 */
public class Weapon {
    private Sprite sprite;
    private boolean waterEnable, saltEnable;
    private Rectangle bound;
    private Vector2 speed;
    private float width, height;
    private float touchX, touchY, deltaX, deltaY, rot, currentWater, waterSupply;
    private static int strength;
    Weapon (String image) {
        width = Gdx.graphics.getWidth();
        height = Gdx. graphics.getHeight();

        sprite = new Sprite(new Texture(image));

        bound = new Rectangle(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());

        speed = new Vector2(0, 5);

        touchX = 0; touchY = 0; rot = 0; strength = 2;
    }

    public void update () {
        if (!waterEnable) {return;}
        else if (Gdx.input.justTouched()) {
            touchX = SnailAssalt2.getTapPosition().x;
            touchY = SnailAssalt2.getTapPosition().y;
            deltaX = touchX - sprite.getX();
            deltaY = touchY - sprite.getY();
            rot = MathUtils.atan2(deltaY, deltaX) * 180 / MathUtils.PI;
            sprite.setRotation(rot);
        }
    }

    public float getBoundsX() {return bound.x;}
    public float getBoundsY() {return bound.y;}
    public float getRot() {return rot;}


    // watergun
    public class Water {
        Weapon water;
        Water () {
            water =  new Weapon("badlogic.jpg");
        }

        public void update () {water.update();}
        public float getBoundsX() {return water.getBoundsX();}
        public float getBoundsY() {return water.getBoundsY();}
        public float getRot() {return water.getRot();}
    }
}
