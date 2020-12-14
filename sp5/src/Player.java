import processing.core.PApplet;


public class Player extends PApplet {
    private KeyboardInput keyboardInput;
    private Dot dot;
    private int boardValue = 3;
    private int playerLife;

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

    public Player(Background b) {
        dot = new Dot(1, 1, width - 1, height - 1, b);
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
