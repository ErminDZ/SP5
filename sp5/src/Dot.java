import java.util.Random;

public class Dot {

    Random random = new Random();

    private int x;
    private int y;
    private final int maxX; // NY
    private final int maxY; // NY

    private Background background; // NY


    public Dot(int x, int y, int maxX, int maxY, Background background)
    {
        this.x = x;
        this.y = y;
        this.maxX = maxX; // NY
        this.maxY = maxY; // NY
        this.background = background; //NY
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveLeft()
    {
        if(!background.canMove(x, y, -1, 0)) // NY
        {
            return; //NY
        }

        --x;

        if(x < 0) // NY
        {
            x = 0; // NY
        }
    }

    public void moveRight()
    {
        if(!background.canMove(x, y, 1, 0))
        {
            return;
        }
        ++x;

        if(x < maxX)
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

        if(y < maxY)
        {
            y = maxY;
        }
    }
}