import processing.core.PApplet;
import processing.core.PFont;

public class Pacman extends PApplet {

    Background background;
    Player player;
    PFont font;
    UserInterface ui; // UI

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(10);
        font = createFont("Arial", 16, true);
        textFont(font, 16);

        background = new Background(this, 25, 25); // 'this' refers to the PApplet that enables us to draw on the actual sketch.

        player = new Player();
        ui = new UserInterface(this, player); // UI

    }

    public void draw() {

        player.updatePlayer();
        background.clearBoard();

        background.setBoardValue(player.getX(), player.getY(), player.getBoardValue());

        background.UpdateBoard();

        // ui.ui(); // UI KAN IKKE FÅ DET TIL AT VIRKE. WORK IN PROGRESS
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


