import processing.core.PApplet;

public class Main extends PApplet
{
    public static void main(String[] args)
    {
        String[] processingArgs = {"MySketch"};
        Pacman pacman = new Pacman();
        PApplet.runSketch(processingArgs, pacman);
    }
}
