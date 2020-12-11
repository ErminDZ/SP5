import processing.core.PApplet;


public class Player extends PApplet{
    private Keys keys = new Keys();
    private Dot player;
    private int[][] board;



public void player1(){
    player = new Dot(0, 0, width-1, height-1);
    keys = new Keys();
}
    public void onKeyPressed(char ch)
    {
        keys.onKeyPressed(ch);
        keys.onKeyPressed2(); //NY
    }
    public void onKeyReleased(char ch)
    {
        keys.onKeyReleased(ch);
        keys.onKeyReleased2(); //NY
    }
    private void updatePlayer()
    {
        //Update player
        if (keys.wDown() && !keys.sDown())
        {
            player.moveUp();
        }
        if (keys.aDown() && !keys.dDown())
        {
            player.moveLeft();
        }
        if (keys.sDown() && !keys.wDown())
        {
            player.moveDown();
        }
        if (keys.dDown() && !keys.aDown())
        {
            player.moveRight();
        }
    }

    public void populateBoard() {
    Background b = new Background(this);
    b.UpdateBoard();
        board[player.getX()][player.getY()] = 1;

    }

public void Update1(){
    player1();
    updatePlayer();
    populateBoard();
}


}
