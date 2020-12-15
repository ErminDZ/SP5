import processing.core.PApplet;

import java.util.Random;

public class Background {


    private PApplet p;

    public Dot d;
    public Player player;

    int[][] board;
    static int[][] staticMap;


    public Background(PApplet p) {
        this.p = p;
        this.board = getStaticMap;

    }

    public int[][] getStaticMap = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public int[][] getBoard() {
        return board;
    }

    public void clearBoard() {
        board = getStaticMap;

//        for (int y = player.getY(); y < board.length; ++y) {
//            for (int x = 1; x < board.length; ++x) {
//                board[x][y] = 1;
    }


    public void setBoardValue(int x, int y, int value) {
        if (x > 25)
            System.out.println(x);
//        if (board == null) System.out.println("Board not found...");
        board[x][y] = value;
    }

    // Updates visuals
    public void UpdateBoard() {

        int[][] board = getBoard();

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                if (board[x][y] == 0) { //Walls
                    p.fill(252, 0, 0);
                } else if (board[x][y] == 1) { // path
                    p.fill(0, 0, 0);
                } else if (board[x][y] == 2) {
                    p.fill(255, 0, 0);
                } else if (board[x][y] == 3) { //ORANGE
                    p.fill(255, 168, 1);
                } else if (board[x][y] == 4) // RED
                {
                    p.fill(255, 0, 0);
                } else if (board[x][y] == 5) // PINK
                {
                    p.fill(255, 193, 203);
                } else if (board[x][y] == 6) // LIGHT BLUE
                {
                    p.fill(0, 255, 255);
                }

                // DELETE ME:
                if (x == 0 && y == 10 || x == 19 && y == 10)
                    p.fill(255, 255, 255);

                p.stroke(100, 100, 100);
                p.rect(x * 40, y * 40, 40, 40);
            }
        }
    }

    public boolean canMove(int x, int y, int deltaX, int deltaY) {
        // Delta x or y is the value that we want to move. e.g. deltaX == 1, is +1 to x coordinate.
        if (board[x + deltaX][y + deltaY] == 0) {
            return false;
        }
        return true;
    }
}





