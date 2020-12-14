import processing.core.PApplet;


public class Player extends PApplet {

    private KeyboardInput keyboardInput;
    private Dot dot;
    private int[][] board;
    private int boardValue = 1;
    private int playerLife; // UI

    public int getPlayerLife() {
        return this.playerLife;
    }

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

        this.playerLife = 3;          // UI / Player Class
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
