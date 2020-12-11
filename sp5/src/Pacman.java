import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {

    Background b;
    Player p;
    PFont font;

    public void settings() {
        size(1001, 1001);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);

        b = new Background(this, 25, 25); // 'this' refers to the PApplet that enables us to draw on the actual sketch.
        p = new Player();

    }

    public void draw() {

        p.updatePlayer();
        b.clearBoard();

        b.setBoardValue(p.getX(), p.getY(), p.getBoardValue());

        b.UpdateBoard();
    }

    public void keyPressed()
    {
        p.onKeyPressed(key);
    }

    public void keyReleased()
    {
        p.onKeyReleased(key);
    }
}

