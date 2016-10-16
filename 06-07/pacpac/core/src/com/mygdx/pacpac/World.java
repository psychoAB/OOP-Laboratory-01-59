package com.mygdx.pacpac;

public class World {
    private Pacpac pacpac;
    private Pacman pacman;
    private Maze maze;

    World(Pacpac pacpac) {
        this.pacpac = pacpac;
        pacman = new Pacman(60, 60);
        maze = new Maze();
    }

    Pacman getPacman() {
        return pacman;
    }

    Maze getMaze() {
        return maze;
    }
}
