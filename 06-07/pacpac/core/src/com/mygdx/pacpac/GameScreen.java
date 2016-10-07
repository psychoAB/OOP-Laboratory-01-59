package com.mygdx.pacpac;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter {
    private Pacpac pacpac;
    
    public GameScreen(Pacpac pacpac) {
        this.pacpac = pacpac;
    }

    @Override
    public void render(float delta) {
        System.out.println("Hello " + delta);
    }
}
