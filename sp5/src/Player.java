import processing.core.PApplet;


public class Player extends PApplet {

    private KeyboardInput keyboardInput;
    private Dot dot;
    private int[][] board;
    private int boardValue = 1;
    private int player1Life;
    private int player2Life;

//    public int getPlayer1Life() { Kan ikke få det til, at virke helt.
//        return this.player1Life;
//    }
//
//    public int getPlayer2Life() {
//        return this.player2Life;
//    }

    public int getX()
    {
        return this.dot.getX();
    }

    public int getY()
    {
        return this.dot.getY();
    }

    public int getBoardValue()
    {
        return boardValue;
    }

    public Player() {
        dot = new Dot(0, 0, width - 1, height - 1);
        keyboardInput = new KeyboardInput();
    }



    public void onKeyPressed(char ch) {

        KeyboardInput.onKeyPressed(ch);
    }

    public void onKeyReleased(char ch) {
        KeyboardInput.onKeyReleased(ch);
    }

    public void updatePlayer() {
        //Update player
        if (KeyboardInput.wKeyUp() && !KeyboardInput.sKeyDown()) {
            dot.moveUp();
        }
        if (KeyboardInput.aKeyLeft() && !KeyboardInput.dKeyRight()) {
            dot.moveLeft();
        }
        if (KeyboardInput.sKeyDown() && !KeyboardInput.wKeyUp()) {
            dot.moveDown();
        }
        if (KeyboardInput.dKeyRight() && !KeyboardInput.aKeyLeft()) {
            dot.moveRight();
        }
    }

    public void Update1() {

        updatePlayer();
    }
}
