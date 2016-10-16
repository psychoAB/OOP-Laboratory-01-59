package com.mygdx.pacpac;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;

public class MazeRenderer {

    private SpriteBatch batch;
    private Maze maze;

    private Texture wallImg;
    private Texture dotImg;

    public MazeRenderer(SpriteBatch batch, Maze maze) {
        this.batch = batch;
        this.maze = maze;

        wallImg = new Texture("wall.png");
        dotImg = new Texture("dot.png");
    }

    public void render() {
        batch.begin();
        for(int r = 0; r < maze.getHeight(); r++) {
            for(int c = 0; c < maze.getWidth(); c++) {
                int x = c * WorldRenderer.BLOCK_SIZE;
                int y = Pacpac.HEIGHT - (r * WorldRenderer.BLOCK_SIZE) - WorldRenderer.BLOCK_SIZE;

                if(maze.hasWallAt(r, c)) {
                    batch.draw(wallImg, x, y);
                } else if(maze.hasDotAt(r, c)) {
                    batch.draw(dotImg, x, y);
                }
            }
        }
        batch.end();
    }
}
