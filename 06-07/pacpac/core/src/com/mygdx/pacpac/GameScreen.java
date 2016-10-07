package com.mygdx.pacpac;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
    private Pacpac pacpac;
    private Texture pacmanImg;
    
    public GameScreen(Pacpac pacpac) {
        this.pacpac = pacpac;
        pacmanImg = new Texture("pacman.png");
    }

    @Override
    public void render(float delta) {
        SpriteBatch batch = pacpac.batch;
        batch.begin();
        batch.draw(pacmanImg, 100, 100);
        batch.end();
    }
}
