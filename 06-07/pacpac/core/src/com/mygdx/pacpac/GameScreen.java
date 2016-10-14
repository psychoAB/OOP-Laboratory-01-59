package com.mygdx.pacpac;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
    private Pacpac pacpac;
    private World world;
    private Pacman pacman;
    private Texture pacmanImg;
    
    public GameScreen(Pacpac pacpac) {
        this.pacpac = pacpac;
        pacmanImg = new Texture("pacman.png");
        world = new World(pacpac);
        pacman = world.getPacman();
    }

    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = pacpac.batch;
        batch.begin();
        Vector2 pacmanPosition = pacman.getPosition();
        batch.draw(pacmanImg, pacmanPosition.x, pacmanPosition.y);
        batch.end();
    }

    private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            pacman.move(pacman.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            pacman.move(pacman.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            pacman.move(pacman.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            pacman.move(pacman.DIRECTION_LEFT);
        }
    }
}
