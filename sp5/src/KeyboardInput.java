import processing.core.PApplet;

public class KeyboardInput extends PApplet
{

    static boolean wKeyUp = false;
    static boolean aKeyLeft = false;
    static boolean sKeyDown = false;
    static boolean dKeyRight = false;

    static boolean arrowKeyUp = false;
    static boolean arrowKeyLeft = false;
    static boolean arrowKeyDown = false;
    static boolean arrowKeyRight = false;


    public static boolean wKeyUp()
    {
        return wKeyUp;
    }

    public static boolean aKeyLeft()
    {
        return aKeyLeft;
    }

    public static boolean sKeyDown()
    {
        return sKeyDown;
    }

    public static boolean dKeyRight()
    {
        return dKeyRight;
    }


    public boolean arrowKeyUp()
    {
        return arrowKeyUp;
    }

    public boolean arrowKeyLeft()
    {
        return arrowKeyLeft;
    }

    public boolean arrowKeyDown()
    {
        return arrowKeyDown;
    }

    public boolean arrowKeyRight()
    {
        return arrowKeyRight;
    }

    // onKeyPressed and onKeyReleased is player 1 keyboard input.

    public static void onKeyPressed(char ch)
    {
        if (ch == 'W' || ch == 'w') {
            wKeyUp = true;
        } else if (ch == 'A' || ch == 'a') {
            aKeyLeft = true;
        } else if (ch == 'S' || ch == 's') {
            sKeyDown = true;
        } else if (ch == 'D' || ch == 'd') {
            dKeyRight = true;
        }
    }


    public static void onKeyReleased(char ch)
    {
        if (ch == 'W' || ch == 'w') {
            wKeyUp = false;
        } else if (ch == 'A' || ch == 'a') {
            aKeyLeft = false;
        } else if (ch == 'S' || ch == 's') {
            sKeyDown = false;
        } else if (ch == 'D' || ch == 'd') {
            dKeyRight = false;
        }
    }

    // onKeyCodePressed and onKeyCodeReleased is player 2 keyboard Input.

    public void onKeyCodePressed()
    {
        if (keyCode == UP) {
            arrowKeyUp = true;
        } else if (keyCode == LEFT) {
            arrowKeyLeft = true;
        } else if (keyCode == DOWN) {
            arrowKeyDown = true;
        } else if (keyCode == RIGHT) {
            arrowKeyRight = true;
        }
    }


    public void onKeyCodeReleased()
    {
        if (keyCode == UP) {
            arrowKeyUp = false;
        } else if (keyCode == LEFT) {
            arrowKeyLeft = false;
        } else if (keyCode == DOWN) {
            arrowKeyDown = false;
        } else if (keyCode == RIGHT) {
            arrowKeyRight = false;
        }
    }
}
