package com.missionbit.megajumper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by lin00 on 6/23/2016.
 */
public class Platform {
    Sprite sprite;
    private float width, height;
    private Vector2 position;
    private Rectangle bounds;

    public Platform () {

        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        sprite = new Sprite(new Texture ("tramp.png"));
        position = new Vector2();
        bounds = new Rectangle();
        bounds.set(position.x, position.y, sprite.getWidth(), sprite.getHeight());
    }

    public void draw(SpriteBatch batch) {batch.draw(sprite, position.x, position.y);}

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(float x, float y) {
        position.x = x;
        position.y = y;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(float x, float y) {
        bounds.set(x, y, sprite.getWidth(), sprite.getHeight());

    }
}
