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

        // Player Win/ Player Lose
        if (player.getPlayerLife() > 2 && player.getPlayerLife() < 3) {
            p.fill(255);
            p.text("You!", width / 2, height / 2);
            p.textSize(100);
        } else if (player.getPlayerLife() > 1 && player.getPlayerLife() < 2) {
            p.fill(255);
            p.text("Player 1 wins!", width / 2, height / 2);
            p.textSize(100);
        } else if (player.getPlayerLife() > 0){

        }

        //Number of ghosts left
        if (player.getPlayerLife() > 0)
        {
            p.fill(255);
        }
    }
}