import processing.core.PApplet;


public class Player extends PApplet {
    private KeyboardInput keyboardInput;
    private Dot dot;

    private int boardValue = 1;

    public int getX() {
        return this.dot.getX();
    }

    public int getY() {
        return this.dot.getY();
    }

    public int getBoardValue() {
        return boardValue;
    }

    public Player() {
        dot = new Dot(12, 12);
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
                dot.setX(24);
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
        if (dot.getY() == 12 || dot.getY() == 13)
        {
            if (dot.getX() == 0 || dot.getX() == 24)
            {
                return true;
            }
        }
        return false;
    }

}


