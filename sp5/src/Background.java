import processing.core.PApplet;

public class Background {


    private PApplet p;

    public Dot player;


    int[][] board;
    static int[][] staticMap;
   // public int x;
   // public int y;


    public Background(PApplet p) {
        this.p = p;

        this.board = getStaticMap;
    }

    public int[][] getStaticMap = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public int[][] getBoard() {
        return board;
    }

    public void clearBoard() {

        board = getStaticMap;
    }


    public void setBoardValue(int x, int y, int value) {
        if (board == null) System.out.println("Board not found...");

        board[x][y] = value;
    }

    // Updates visuals
    public void UpdateBoard() {

        int[][] board = getBoard();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {

                if (board[x][y] == 0) { //wall
                    p.fill(252, 0, 0);
                } else if (board[x][y] == 1) { //path
                    p.fill(0, 0, 0);
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






