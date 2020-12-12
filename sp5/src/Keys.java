import processing.core.PApplet;

import java.util.Random;

public class Keys extends PApplet{


        private boolean wKeyUp = false;
        private boolean aKeyLeft = false;
        private boolean sKeyDown = false;
        private boolean dKeyRight = false;

        private boolean arrowKeyUp = false;
        private boolean arrowKeyLeft = false;
        private boolean arrowKeyDown = false;
        private boolean arrowKeyRight = false;


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


        public boolean wKeyUp()
        {
            return wKeyUp;
        }

        public boolean aKeyLeft()
        {
            return aKeyLeft;
        }

        public boolean sKeyDown()
        {
            return sKeyDown;
        }

        public boolean dKeyRight()
        {
            return dKeyRight;
        }


        // KEYCODE IS PLAYER1

        void onKeyCodePressed()
        {
            if(keyCode == UP)
            {
                arrowKeyUp = true;
            }
            else if (keyCode == LEFT)
            {
                arrowKeyLeft = true;
            }
            else if(keyCode == DOWN)
            {
                arrowKeyDown = true;
            }
            else if(keyCode == RIGHT)
            {
                arrowKeyRight = true;
            }
        }


        void onKeyCodeReleased()
        {
            if(keyCode == UP)
            {
                arrowKeyUp = false;
            }
            else if (keyCode == LEFT)
            {
                arrowKeyLeft = false;
            }
            else if(keyCode == DOWN)
            {
                arrowKeyDown = false;
            }
            else if(keyCode == RIGHT)
            {
                arrowKeyRight = false;
            }
        }


        // KEY IS PLAYER2

        void onKeyPressed(char ch)
        {
            if(ch == 'W' || ch == 'w')
            {
                wKeyUp = true;
            }
            else if (ch == 'A' || ch == 'a')
            {
                aKeyLeft = true;
            }
            else if(ch == 'S' || ch == 's')
            {
                sKeyDown = true;
            }
            else if(ch == 'D' || ch == 'd')
            {
                dKeyRight = true;
            }
        }


        void onKeyReleased(char ch)
        {
            if(ch == 'W' || ch == 'w')
            {
                wKeyUp = false;
            }
            else if (ch == 'A' || ch == 'a')
            {
                aKeyLeft = false;
            }
            else if(ch == 'S' || ch == 's')
            {
                sKeyDown = false;
            }
            else if(ch == 'D' || ch == 'd')
            {
                dKeyRight = false;
            }
        }
    }

