package com.mygdx.pacpac;

import com.badlogic.gdx.math.Vector2;
import java.util.LinkedList;

public class Pacman {
    public static final int SPEED = 5;

    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;

    private static final int [][] DIRECTION_OFFSETS = new int [][] {
            {0, 0},
            {0, -1},
            {1, 0},
            {0, 1},
            {-1, 0}
    };

    private Vector2 position;
    
    private int currentDirection;
    private int nextDirection;

    private World world;

    private LinkedList<DotEattenListener> dotEattenListener;

    public Pacman(int x, int y, World world) {
        this.world = world;

        position = new Vector2(x, y);
        dotEattenListener = new LinkedList<DotEattenListener>();

        currentDirection = DIRECTION_STILL;
        nextDirection = DIRECTION_STILL;
    }

    public void update() {
        Maze maze = world.getMaze();

        if(isAtCenter()) {
            if(canMoveInDirection(nextDirection)) {
                currentDirection = nextDirection;
            } else {
                currentDirection = DIRECTION_STILL;
            }
            if(maze.removeDotAt(getRow(), getColumn())) {
                notifyDotEattenListeners();
            }
        }

        position.x += SPEED * DIRECTION_OFFSETS[currentDirection][0];
        position.y += SPEED * DIRECTION_OFFSETS[currentDirection][1];
    }

    public boolean isAtCenter() {
        int blockSize = WorldRenderer.BLOCK_SIZE;

        return ((((int)position.x - blockSize / 2) % blockSize) == 0) &&
                ((((int)position.y - blockSize / 2) % blockSize) == 0);
    }

    private boolean canMoveInDirection(int direction) {
        Maze maze = world.getMaze();

        int newRow = getRow() + DIRECTION_OFFSETS[nextDirection][1];
        int newColumn = getColumn() + DIRECTION_OFFSETS[nextDirection][0];

        return !maze.hasWallAt(newRow, newColumn);
    }
    
    public void setNextDirection(int direction) {
        nextDirection = direction;
    }

    public Vector2 getPosition() {
        return position;
    }

    private int getRow() {
        return ((int)position.y) / WorldRenderer.BLOCK_SIZE;
    }

    private int getColumn() {
        return ((int)position.x) / WorldRenderer.BLOCK_SIZE;
    }

    public interface DotEattenListener {
        void notifyDotEatten();
    }

    public void registerDotEattenListener(DotEattenListener listener) {
        dotEattenListener.add(listener);
    }

    private void notifyDotEattenListeners() {
        for(DotEattenListener listener : dotEattenListener) {
            listener.notifyDotEatten();
        }
    }
}
