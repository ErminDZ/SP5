import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {

    Background background;
    Player player;
    Ghost[] ghosts = new Ghost[4];
    PFont font;
    UserInterface userInterface;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);

        background = new Background(this); // 'this' refers to the PApplet that enables us to draw on the actual sketch.
        player = new Player(background);

        player.getPlayerLife();

        int ghostColorOffset = 3;
        for (int i =0; i < ghosts.length; i++)
        {
//          ghosts[i] = new Ghost(i + ghostColorOffset, p); // TODO: Fix the value of the board so it correctly fits to each ghost color.

        }
    }


    public void draw() {

        background.clearBoard();

        // Update Ghosts
        for (int i = 0; i < ghosts.length; i++)
        {
//            ghosts[i].update();
//            b.setBoardValue(ghosts[i].dot.getX(),ghosts[i].dot.getY(), ghosts[i].getBoardValue());
        }

        // Update Player

        player.updatePlayer();
        background.setBoardValue(player.getX(), player.getY(), player.getBoardValue());

        // Redraw board
        background.UpdateBoard();

        userInterface.ui();
        
    }

    public void keyPressed()
    {
        player.onKeyPressed(key);
    }

    public void keyReleased()
    {
        player.onKeyReleased(key);
    }
}


