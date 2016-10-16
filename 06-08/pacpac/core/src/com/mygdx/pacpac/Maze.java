package com.mygdx.pacpac;

public class Maze {
    private String[] MAP = new String [] {
            "####################",
            "#..................#",
            "#.###.###..###.###.#",
            "#.#...#......#...#.#",
            "#.#.###.####.###.#.#",
            "#.#.#..........#.#.#",
            "#.....###..###.....#",
            "#.#.#..........#.#.#",
            "#.#.###.####.###.#.#",
            "#.#...#......#...#.#",
            "#.###.###..###.###.#",
            "#..................#",
            "####################"
    };

    private boolean [][] hasDots;

    private int height;
    private int width;

    public Maze() {
        height = MAP.length;
        width = MAP[0].length();
        initDotData();
    }
    
    private void initDotData() {
        hasDots = new boolean[height][width];
        
        for(int r = 0; r < height; r++) {
            for(int c = 0; c < width; c++) {
                hasDots[r][c] = MAP[r].charAt(c) == '.';
            }
        }
    }

    public boolean removeDotAt(int r, int c) {
        if(hasDots[r][c]) {
            hasDots[r][c] = false;
            return true;
        }
        return false;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean hasWallAt(int r, int c) {
        return MAP[r].charAt(c) == '#';
    }

    public boolean hasDotAt(int r, int c) {
        return hasDots[r][c];
    }
}
