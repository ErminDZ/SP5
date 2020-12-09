import processing.core.PApplet;

public class Walls extends PApplet {
    private PApplet p;

    public Walls(PApplet p) {
        this.p = p;
    }
   public void testwall(){
       p.fill(255,255,0);
       p.rect(0,0,1001,40);
       p.fill(255,255,0);
       p.rect(0,960,1001,40);
       p.fill(255,255,0);
       p.rect(0,960,40,-450);
       p.fill(255,255,0);
       p.rect(0,0,40,450);

   }
}
