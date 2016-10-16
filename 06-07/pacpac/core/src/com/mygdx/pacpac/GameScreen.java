package com.mygdx.pacpac;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Input.Keys;

public class GameScreen extends ScreenAdapter {
    private Pacpac pacpac;
    private World world;
    private WorldRenderer worldRenderer;
    
    public GameScreen(Pacpac pacpac) {
        this.pacpac = pacpac;
        world = new World(pacpac);
        worldRenderer = new WorldRenderer(pacpac, world);
    }

    @Override public void render(float delta) {
        update(delta);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        worldRenderer.render(delta);
    }

    private void update(float delta) {
        world.update(delta);

        updatePacmanDirection();
    }

    private void updatePacmanDirection() {
        Pacman pacman = world.getPacman();

        if(Gdx.input.isKeyPressed(Keys.UP)) {
            pacman.setNextDirection(pacman.DIRECTION_UP);
        } else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            pacman.setNextDirection(pacman.DIRECTION_RIGHT);
        } else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            pacman.setNextDirection(pacman.DIRECTION_DOWN);
        } else if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            pacman.setNextDirection(pacman.DIRECTION_LEFT);
        } else {
            pacman.setNextDirection(pacman.DIRECTION_STILL);
        }
    }
}
