import processing.core.PApplet;

public class UserInterface extends PApplet {

    Player player;
    private PApplet p;


    public UserInterface(PApplet p, Player player)
    {
        this.player = player;
    }

    public void ui() {
        p.fill(255);
        p.textSize(25);


        //Player life UI
        if (player.getPlayerLife() > 0) {
            p.text("Player Lives: " + player.getPlayerLife(), 25, 25);
        }

        // Player Lose display message. to do: When player loses life, message should dissapear when starting a new life and resetting from starting position in new life.
        if (player.getPlayerLife() == 2) {
            p.fill(255);
            p.text("You lost a life.", width / 2, height / 2);
            p.textSize(100);
        } else if (player.getPlayerLife() == 1) {
            p.fill(255);
            p.text("You lost a life.", width / 2, height / 2);
            p.textSize(100);
        } else if (player.getPlayerLife() == 0){
            p.fill(255);
            p.text("You died.", width / 2, height /2);
            p.textSize(100);
        }

        //Number of ghosts left on map. Need, don't need?
        if (player.getPlayerLife() > 0)
        {
            p.fill(255);
        }
    }
}