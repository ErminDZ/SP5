import processing.core.PApplet;

import java.util.Random;

public class Background {


    private PApplet p;

    public Dot player;

    int width;
    int height;
    int[][] board;

    public Background(PApplet p, int width, int height) {
        this.p = p;

        if (width < 10 || height < 10) {
            throw new IllegalArgumentException("Width and height must be at least 10");
        }

        this.board = new int[width][height];
        this.width = width;
        this.height = height;


    }

    public int[][] getBoard() {
        return board;
    }

    public void clearBoard() {

        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                board[x][y] = 0;
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setBoardValue(int x, int y, int value)
    {
        board[x][y] = value;
    }

    // Updates visuals
    public void UpdateBoard() {

        int[][] board = getBoard();

        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                if (board[x][y] == 0) {
                    p.fill(0, 0, 0);
                } else if (board[x][y] == 1) {
                    p.fill(0, 0, 255);
                } else if (board[x][y] == 2) {
                    p.fill(255, 0, 0);
                } else if (board[x][y] == 3) {
                    p.fill(0, 255, 0);
                } else if (board[x][y] == 4) //NY
                {
                    p.fill(255, 255, 0);
                } else if (board[x][y] == 5) //NY
                {
                    p.fill(0, 255, 0);
                }
                p.stroke(100, 100, 100);
                p.rect(x * 40, y * 40, 40, 40);
            }
        }
    }

}




