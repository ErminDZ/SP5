import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {
    Board board = new Board(this); // 'this' refers to the PApplet that enables us to draw on the actual sketch.
    PFont font;

    public void settings() {
        size(1001, 1001);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);
    }

   /* void keyReleased() {
        game.onKeyReleased(key);
        game.onKeyReleased1();//NY
    }

    void keyPressed() {
        game.onKeyPressed(key);
        game.onKeyPressed1();//NY
    }*/

    public void draw()
    {
        rect(100, 100, 50, 50);
        board.drawBoard();

//        ArrayList<Ghost> ghosts = new ArrayList<Ghost>();
//        Ghost.spawnGhosts(ghosts); // REMOVE THIS COMMENT: In this method we add the 4 ghosts.
//        for(Ghost g : ghosts) // REMOVE THIS COMMENT: In this foreach loop, we update / redraw each ghost.
//        {
//            g.update();
//        }

//        board.update();
//        background(0); //Black
//        // This embedded loop skips over values in the arrays based on
//        // the spacer variable, so there are more values in the array
//        // than are drawn here. Change the value of the spacer variable
//        // to change the density of the points
//        int[][] board = game.getBoard();
//        for (int y = 0; y < game.getHeight(); y++) {
//            for (int x = 0; x < game.getWidth(); x++) {
//                if (board[x][y] == 0) {
//                    fill(0, 0, 0);
//                } else if (board[x][y] == 1) {
//                    fill(0, 0, 255);
//                } else if (board[x][y] == 2) {
//                    fill(255, 0, 0);
//                } else if (board[x][y] == 3) {
//                    fill(254, 255, 0);
//                }
//                stroke(100, 100, 100);
//                rect(x * 40, y * 40, 40, 40);
//            }
//        }
    }
}

    public static void main(String[] args) {

    }