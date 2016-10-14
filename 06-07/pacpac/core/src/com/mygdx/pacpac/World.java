package com.mygdx.pacpac;

public class World {
    private Pacpac pacpac;
    private Pacman pacman;

    World(Pacpac pacpac) {
        this.pacpac = pacpac;
        pacman = new Pacman(100, 100);
    }

    Pacman getPacman() {
        return pacman;
    }
}
