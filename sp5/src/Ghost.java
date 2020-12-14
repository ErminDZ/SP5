import processing.core.PApplet;

import java.util.Random;

public class Ghost extends PApplet {
    private Random rnd = new Random();
    public Dot dot;
    private Background background;
    public int boardValue;
    private Player player;

    Ghost(int boardValue, Player player) //int numberOfEnemies) throws IllegalAccessException
    {
        this.player = player;
        this.boardValue = boardValue;

        dot = new Dot(12, 12);

    }

    public int getBoardValue()
    {
        return boardValue;
    }

    public void update()
    {

            if (rnd.nextInt(3) < 2)
            {

                //We follow
                int dx = player.getX() - dot.getX();
                int dy = player.getY() - dot.getY();

                if (abs(dx) > abs(dy))
                {
                    if (dx > 0)
                    {
                        //Player is to the right
                        dot.moveRight();
                    } else
                    {
                        //Player is to the left
                        dot.moveLeft();
                    }
                } else if (dy > 0)
                {
                    //Player is down;
                    dot.moveDown();
                } else
                {//Player is up;
                    dot.moveUp();
                }
            } else
            {
                //We move randomly
                int move = rnd.nextInt(4);
                if (move == 0)
                {
                    //Move right
                    dot.moveRight();
                } else if (move == 1)
                {
                    //Move left
                    dot.moveLeft();
                } else if (move == 2)
                {
                    //Move up
                    dot.moveUp();
                } else if (move == 3)
                {
                    //Move down
                    dot.moveDown();
                }
            }
    }
}