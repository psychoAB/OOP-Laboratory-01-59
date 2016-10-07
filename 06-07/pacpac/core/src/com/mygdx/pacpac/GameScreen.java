package com.mygdx.pacpac;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {
    private Pacpac pacpac;
    private Texture pacmanImg;
    private int x;
    private int y;
    
    public GameScreen(Pacpac pacpac) {
        this.pacpac = pacpac;
        pacmanImg = new Texture("pacman.png");
        x = 100;
        y = 100;
    }

    @Override
    public void render(float delta) {
        x += 5;
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = pacpac.batch;
        batch.begin();
        batch.draw(pacmanImg, x, y);
        batch.end();
    }
}
