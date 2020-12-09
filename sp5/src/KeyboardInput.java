import processing.core.PApplet;

public class KeyboardInput extends PApplet
{

    boolean wUp = false;
    boolean aLeft = false;
    boolean sDown = false;
    boolean dRight = false;

    boolean arrowUp = false;
    boolean arrowLeft = false;
    boolean arrowDown = false;
    boolean arrowRight = false;


    public boolean wUp()
    {
        return wUp;
    }

    public boolean aLeft()
    {
        return aLeft;
    }

    public boolean sDown()
    {
        return sDown;
    }

    public boolean dRight()
    {
        return dRight;
    }


    public boolean arrowUp()
    {
        return arrowUp;
    }

    public boolean arrowLeft()
    {
        return arrowLeft;
    }

    public boolean arrowDown()
    {
        return arrowDown;
    }

    public boolean arrowRight()
    {
        return arrowRight;
    }


    public void onKeyPressed(char ch)
    {
        if (ch == 'W' || ch == 'w') {
            wUp = true;
        } else if (ch == 'A' || ch == 'a') {
            aLeft = true;
        } else if (ch == 'S' || ch == 's') {
            sDown = true;
        } else if (ch == 'D' || ch == 'd') {
            dRight = true;
        }
    }


    public void onKeyReleased(char ch)
    {
        if (ch == 'W' || ch == 'w') {
            wUp = false;
        } else if (ch == 'A' || ch == 'a') {
            aLeft = false;
        } else if (ch == 'S' || ch == 's') {
            sDown = false;
        } else if (ch == 'D' || ch == 'd') {
            dRight = false;
        }
    }


    public void onKeyCodePressed()
    {
        if (keyCode == UP) {
            arrowUp = true;
        } else if (keyCode == LEFT) {
            arrowLeft = true;
        } else if (keyCode == DOWN) {
            arrowDown = true;
        } else if (keyCode == RIGHT) {
            arrowRight = true;
        }
    }


    public void onKeyCodeReleased()
    {
        if (keyCode == UP) {
            arrowUp = false;
        } else if (keyCode == LEFT) {
            arrowLeft = false;
        } else if (keyCode == DOWN) {
            arrowDown = false;
        } else if (keyCode == RIGHT) {
            arrowRight = false;
        }
    }
}
