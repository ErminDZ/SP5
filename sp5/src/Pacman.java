import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {

    Background background;
    Player player;
    PFont font;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);

        background = new Background(this); // 'this' refers to the PApplet that enables us to draw on the actual sketch.
        player = new Player(background);
        UserInterface ui;


        // for each ghost!! {
           //ghost.setBoard(b.getBoard());
        // }

    }

    public void draw() {

        player.updatePlayer();
        background.clearBoard();

        background.setBoardValue(player.getX(), player.getY(), player.getBoardValue());

        // checkCollisions(); // this method is to implement collision checks for pacman vs ghosts, cheese and powerups.

        background.UpdateBoard();

        ui.ui();
    }

    public void keyPressed() {
        player.onKeyPressed(key);
    }

    public void keyReleased() {
        player.onKeyReleased(key);
    }
}


