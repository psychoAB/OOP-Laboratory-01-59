package com.mygdx.pacpac;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
    public static final int BLOCK_SIZE = 40;
    
    private SpriteBatch batch;
    private Pacpac pacpac;
    private World world;

    private Texture pacmanImg;

    private MazeRenderer mazeRenderer;

    public WorldRenderer(Pacpac pacpac, World world) {
        this.pacpac = pacpac;
        this.world = world;

        batch = pacpac.batch;
        
        mazeRenderer = new MazeRenderer(batch, world.getMaze());
        pacmanImg = new Texture("pacman.png");
    }

    public void render(float delta) {
        Pacman pacman = world.getPacman();
        
        mazeRenderer.render();

        batch.begin();
        Vector2 pacmanPosition = pacman.getPosition();
        batch.draw(pacmanImg, pacmanPosition.x - BLOCK_SIZE / 2, Pacpac.HEIGHT - pacmanPosition.y - BLOCK_SIZE / 2);
        batch.end();
    }
}
