import processing.core.PApplet;


public class Player extends PApplet {
    private KeyboardInput keyboardInput;
    private Dot dot;

    private int boardValue = 3;

    public int getX() {
        return this.dot.getX();
    }

    public int getY() {
        return this.dot.getY();
    }

    public int getBoardValue() {
        return boardValue;
    }

    public Player(Background b) {
        dot = new Dot(1, 1,-1,-1, b);
        keyboardInput = new KeyboardInput();
    }


    public void onKeyPressed(char ch) {

        KeyboardInput.onKeyPressed(ch);
    }

    public void onKeyReleased(char ch) {
        KeyboardInput.onKeyReleased(ch);
    }

    public void updatePlayer() {
        if (KeyboardInput.wKeyUp() && !KeyboardInput.sKeyDown()) {
            dot.moveUp();
        }
        if (KeyboardInput.aKeyLeft() && !KeyboardInput.dKeyRight()) {
            if (checkForTeleport())
            {
                dot.setX(20);
            }
            dot.moveLeft();
        }
        if (KeyboardInput.sKeyDown() && !KeyboardInput.wKeyUp()) {
            dot.moveDown();
        }
        if (KeyboardInput.dKeyRight() && !KeyboardInput.aKeyLeft()) {
            if (checkForTeleport())
            {
                dot.setX(0);
            }
            dot.moveRight();
        }
    }

    private boolean checkForTeleport()
    {
        if (dot.getY() == 10 || dot.getY() == 9)
        {
            if (dot.getX() == 0 || dot.getX() == 24)
            {
                return true;
            }
        }
        return false;
    }
}


