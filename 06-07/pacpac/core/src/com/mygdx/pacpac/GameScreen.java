package com.mygdx.pacpac;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Input.Keys;

public class GameScreen extends ScreenAdapter {
    private Pacpac pacpac;
    private World world;
    private WorldRenderer worldRenderer;
    private Pacman pacman;
    
    public GameScreen(Pacpac pacpac) {
        this.pacpac = pacpac;
        world = new World(pacpac);
        worldRenderer = new WorldRenderer(pacpac, world);
        pacman = world.getPacman();
    }

    @Override public void render(float delta) {
        update(delta);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        worldRenderer.render(delta);
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
