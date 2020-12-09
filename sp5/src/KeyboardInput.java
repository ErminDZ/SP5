import processing.core.PApplet;

public class KeyboardInput extends PApplet {


    boolean wDown = false;
    boolean aDown = false;
    boolean sDown = false;
    boolean dDown = false;

    boolean upArrow = false;
    boolean leftArrow = false;
    boolean downArrow = false;
    boolean rightArrow = false;

    public boolean wDown()
    {
        return wDown;
    }

    public boolean aDown()
    {
        return aDown;
    }

    public boolean sDown()
    {
        return sDown;
    }

    public boolean dDown()
    {
        return dDown;
    }



    public boolean upArrow()
    {
        return upArrow;
    }

    public boolean leftArrow()
    {
        return leftArrow;
    }

    public boolean downArrow()
    {
        return downArrow;
    }

    public boolean rightArrow()
    {
        return rightArrow;
    }


    public void onKeyPressed(char ch) {
        if (ch == 'W' || ch == 'w') {
            wDown = true;
        } else if (ch == 'A' || ch == 'a') {
            aDown = true;
        } else if (ch == 'S' || ch == 's') {
            sDown = true;
        } else if (ch == 'D' || ch == 'd') {
            dDown = true;
        }
    }

    public void onKeyReleased(char ch) {
        if (ch == 'W' || ch == 'w') {
            wDown = false;
        } else if (ch == 'A' || ch == 'a') {
            aDown = false;
        } else if (ch == 'S' || ch == 's') {
            sDown = false;
        } else if (ch == 'D' || ch == 'd') {
            dDown = false;
        }
    }

    public void onKeyCodePressed() {
        if (keyCode == UP) {
            upArrow = true;
        } else if (keyCode == LEFT) {
            leftArrow = true;
        } else if (keyCode == DOWN) {
            downArrow = true;
        } else if (keyCode == RIGHT) {
            rightArrow = true;
        }
    }

    public void onKeyCodeReleased() {
        if (keyCode == UP) {
            upArrow = false;
        } else if (keyCode == LEFT) {
            leftArrow = false;
        } else if (keyCode == DOWN) {
            downArrow = false;
        } else if (keyCode == RIGHT) {
            rightArrow = false;
        }
    }
}
