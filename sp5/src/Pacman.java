import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {

    Background b;
    Player p;
    PFont font;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);

        b = new Background(this); // 'this' refers to the PApplet that enables us to draw on the actual sketch.
        p = new Player(b);


        // for each ghost!! {
           //ghost.setBoard(b.getBoard());
        // }

    }

    public void draw() {

        p.updatePlayer();
        b.clearBoard();

        b.setBoardValue(p.getX(), p.getY(), p.getBoardValue());

        // checkCollisions(); // this method is to implement collision checks for pacman vs ghosts, cheese and powerups.

        b.UpdateBoard();
    }

    public void keyPressed() {
        p.onKeyPressed(key);
    }

    public void keyReleased() {
        p.onKeyReleased(key);
    }
}


