import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {

    Background b;
    Player p;
    Ghost[] ghosts = new Ghost[4];
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

        int ghostColorOffset = 3;
        for (int i =0; i < ghosts.length; i++)
        {
          ghosts[i] = new Ghost(i + ghostColorOffset, p, b); // TODO: Fix the value of the board so it correctly fits to each ghost color.

        }
    }


    public void draw() {

        b.clearBoard();

        // Update Ghosts
        for (int i = 0; i < ghosts.length; i++)
        {
            ghosts[i].update();
            b.setBoardValue(ghosts[i].dot.getX(),ghosts[i].dot.getY(), ghosts[i].getBoardValue());
        }

        // Update Player

        p.updatePlayer();
        b.setBoardValue(p.getX(), p.getY(), p.getBoardValue());

        // Redraw board
        b.UpdateBoard();
        b.UpdateFood();
        
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


