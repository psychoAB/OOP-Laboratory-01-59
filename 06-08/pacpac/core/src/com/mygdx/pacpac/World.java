package com.mygdx.pacpac;

public class World {
    private Pacpac pacpac;
    private Maze maze;
    private Pacman pacman;

    World(Pacpac pacpac) {
        this.pacpac = pacpac;

        maze = new Maze();
        pacman = new Pacman(60, 60, maze);
    }

    public void update(float delta) {
        pacman.update();
    }

    Pacman getPacman() {
        return pacman;
    }

    Maze getMaze() {
        return maze;
    }
}
