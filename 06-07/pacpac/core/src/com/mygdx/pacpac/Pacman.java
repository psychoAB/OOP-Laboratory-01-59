package com.mygdx.pacpac;

import com.badlogic.gdx.math.Vector2;

public class Pacman {
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

    public Pacman(int x, int y) {
        position = new Vector2(x, y);
    }

    public void move(int direction) {
        position.x += 10 * DIRECTION_OFFSETS[direction][0];
        position.y += 10 * DIRECTION_OFFSETS[direction][1];
    }

    public Vector2 getPosition() {
        return position;
    }
}
