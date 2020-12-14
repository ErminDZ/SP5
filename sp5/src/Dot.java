import java.util.Random;

public class Dot {

    Random random = new Random();

    private int x;
    private int y;

    private boolean  finish = false;

    public Dot(int x, int y)
    {
        this.x = x;
        this.y = y;
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
        // TODO: Collision detection
        --x;
    }

    public void moveRight()
    {
        ++x;
    }

    public void moveUp()
    {
        --y;
    }

    public void moveDown()
    {
        ++y;
    }
}