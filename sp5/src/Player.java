import processing.core.PApplet;


public class Player extends PApplet {
    private Keys keys;
    private Dot dot;
    private int[][] board;
    private int boardValue = 1;

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
        keys = new Keys();
    }



    public void onKeyPressed(char ch) {

        keys.onKeyPressed(ch);
    }

    public void onKeyReleased(char ch) {
        keys.onKeyReleased(ch);
    }

    public void updatePlayer() {
        //Update player
        if (keys.wDown() && !keys.sDown()) {
            dot.moveUp();
        }
        if (keys.aDown() && !keys.dDown()) {
            dot.moveLeft();
        }
        if (keys.sDown() && !keys.wDown()) {
            dot.moveDown();
        }
        if (keys.dDown() && !keys.aDown()) {
            dot.moveRight();
        }
    }

    public void Update1() {

        updatePlayer();
    }
}
