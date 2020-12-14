import java.util.Random;

public class Dot {

    Random random = new Random();

    private int x;
    private int y;
    private final int maxX;
    private final int maxY;
    private boolean  finish = false;

    private Background background;

    public Dot(int x, int y, int maxX, int maxY, Background b)
    {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
        this.background = b;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void moveLeft()
    {
        if(!background.canMove(x, y, -1, 0))
        {
            return;
        }

        --x;
        if(x < 0)
        {
            x = 0;
        }
    }

    public void moveRight()
    {
        if(!background.canMove(x, y, 1, 0))
        {
            return;
        }

        ++x;
        if(x > maxX)
        {
            x = maxX;
        }
    }

    public void moveUp()
    {
        if(!background.canMove(x, y, 0, -1))
        {
            return;
        }

        --y;
        if(y < 0)
        {
            y = 0;
        }
    }

    public void moveDown()
    {
        if(!background.canMove(x, y, 0, +1))
        {
            return;
        }

        ++y;
        if(y > maxY)
        {
            y = maxY;
        }
    }
    void finish()
    {
        this.x = random.nextInt(maxX);
        this.y = random.nextInt(maxY);
        finish = true;
    }


}