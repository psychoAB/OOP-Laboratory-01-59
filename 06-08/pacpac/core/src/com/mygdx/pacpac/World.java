package com.mygdx.pacpac;

public class World {
    private Pacpac pacpac;
    private Maze maze;
    private Pacman pacman;
    private int score;

    World(Pacpac pacpac) {
        this.pacpac = pacpac;

        maze = new Maze();
        pacman = new Pacman(60, 60, this);

        score = 0;
    }

    public void update(float delta) {
        pacman.update();
    }

    public void increaseScore() {
        score++;
    }

    Pacman getPacman() {
        return pacman;
    }

    Maze getMaze() {
        return maze;
    }

    public int getScore() {
        return score;
    }
}
