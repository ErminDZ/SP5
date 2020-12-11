import processing.core.PApplet;

import java.util.Random;

public class Ghost extends PApplet {
private Random rnd;
private Dot[] enemies;
private Dot player;

Ghost(int numberOfEnemies, Dot player) throws IllegalAccessException {
    this.player = player;
    if (numberOfEnemies <0)
    {
        throw  new IllegalAccessException("Number of enemies must be positive");
    }
    enemies = new Dot[numberOfEnemies];

    for (int i =0; i < numberOfEnemies; i++)
    {
        enemies[i] = new Dot(width-1, height-1, width-1, height -1);
    }
}

    private void updateEnemies()
    {
        for (int i = 0; i < enemies.length; ++i)
        {
            //Should we follow or move randomly?
            //2 out of 3 we will follow..
            if (rnd.nextInt(3) < 2)
            {
                //We follow
                int dx = player.getX() - enemies[i].getX();
                int dy = player.getY() - enemies[i].getY();

                if (abs(dx) > abs(dy))
                {
                    if (dx > 0)
                    {
                        //Player is to the right
                        enemies[i].moveRight();
                    } else
                    {
                        //Player is to the left
                        enemies[i].moveLeft();
                    }
                } else if (dy > 0)
                {
                    //Player is down;
                    enemies[i].moveDown();
                } else
                {//Player is up;
                    enemies[i].moveUp();
                }
            } else
            {
                //We move randomly
                int move = rnd.nextInt(4);
                if (move == 0)
                {
                    //Move right
                    enemies[i].moveRight();
                } else if (move == 1)
                {
                    //Move left
                    enemies[i].moveLeft();
                } else if (move == 2)
                {
                    //Move up
                    enemies[i].moveUp();
                } else if (move == 3)
                {
                    //Move down
                    enemies[i].moveDown();
                }
            }
        }
    }

}
