import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {
    //Board b = new Board(this); // 'this' refers to the PApplet that enables us to draw on the actual sketch.
    PFont font;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);
    }


    public void draw() {

        Background b = new Background(this);
        b.UpdateBoard();
        Walls w = new Walls (this);
        w.testwall();

    }
}

