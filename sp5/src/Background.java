import processing.core.PApplet;

public class Background {


    private PApplet p;

    public Dot d;
    public Player player;

    int[][] board;


    public Background(PApplet p) {
        this.p = p;
        this.board = getStaticMap(); //NY


    }


    public int[][] getBoard() {
        return this.board;
    }

    public void clearBoard() {
        this.board = getStaticMap(); // NY

    }


    public void setBoardValue(int x, int y, int value) {
        if (x > 25)
            System.out.println(x);
        this.board[x][y] = value;
    }

    // Updates visuals
    public void UpdateBoard() {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {

                if (board[x][y] == 0)
                {
                    p.fill(0, 0, 255);// WALLS/blue
                }

                else if (board[x][y] == 1)
                {
                    p.fill(0, 0, 0);// PATH/black
                }

                else if (board[x][y] == 2)
                {
                    p.fill(255, 255, 0); //Yellow/player
                }

                else if (board[x][y] == 3)
                {
                    p.fill(111, 111, 111);// ghost spawn area/gray
                }

                else if (board[x][y] == 4)
                {
                    p.fill(255, 0, 0);// ghost/RED
                }

                else if (board[x][y] == 5)
                {
                    p.fill(255, 0, 255);// ghost/purple
                }

                else if (board[x][y] == 6)
                {
                    p.fill(0, 255, 255);// ghost/LIGHT BLUE
                }

                // DELETE ME:
                if (x == 0 && y == 10 || x == 19 && y == 10)
                    p.fill(255, 255, 255);

                p.stroke(100, 100, 100);
                p.rect(x * 40, y * 40, 40, 40);
            }
        }


    }

    public int[][] getStaticMap() {
        return
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                        {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 1, 1, 0, 0, 1, 0, 3, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
                        {0, 0, 0, 0, 1, 0, 0, 1, 3, 3, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 0, 0, 0, 1, 0, 0, 1, 3, 3, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 1, 1, 0, 0, 1, 0, 3, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                        {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
    }

    public boolean canMove(int x, int y, int deltaX, int deltaY) {
        // Delta x or y is the value that we want to move. e.g. deltaX == 1, is +1 to x coordinate.
        if (board[x + deltaX][y + deltaY] == 0 || board[x + deltaX][y + deltaY] == 3 ) {
            return false;
        }
        return true;
    }

    public void UpdateFood() {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {

                if (board[x][y] == 1) { // food
                    p.fill(0, 255, 0);


                    p.stroke(100, 100, 100);
                    p.ellipse(x * 40 + 20, y * 40 + 20, 10, 10); // 20 is half the square (offset)
                }
            }
        }
    }
}







