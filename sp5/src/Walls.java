import processing.core.PApplet;

public class Walls extends PApplet {
    private PApplet p;

    public Walls(PApplet p) {
        this.p = p;
    }
   public void testwall() {



// top outter wall
       p.fill(255, 255, 0);
       p.rect(0, 0, 800, 40);

// bottom outter wall
       p.fill(255, 255, 0);
       p.rect(0, 760, 800, 40);

// bottom left outter wall
       p.fill(255, 255, 0);
       p.rect(0, 760, 40, -320);
       p.fill(255, 255, 0);
       p.rect(0, 440, 160, 40);

// top left outter wall
       p.fill(255, 255, 0);
       p.rect(0, 0, 40, 360);
       p.fill(255, 255, 0);
       p.rect(0, 320, 160, 40);

// top right outter wall
       p.fill(255, 255, 0);
       p.rect(760, 0, 40, 360);
       p.fill(255, 255, 0);
       p.rect(760, 320, -120, 40);

// bottom right outter wall
       p.fill(255, 255, 0);
       p.rect(760, 760, 40, -320);
       p.fill(255, 255, 0);
       p.rect(760, 440, -120, 40);

// spawn area for ghost
       p.fill(255, 255, 0);
       p.rect(320, 320, 40, 40);
       p.fill(255, 255, 0);
       p.rect(280, 360, 40, 40);
       p.fill(255, 255, 0);
       p.rect(280, 400, 240, 40);
       p.fill(255, 255, 0);
       p.rect(440, 320, 40, 40);
       p.fill(255, 255, 0);
       p.rect(480, 360, 40, 40);

       /* top half*/

// top left block
       p.fill(255, 255, 0);
       p.rect(80, 80, 80, 80);

// under top left block
       p.fill(255, 255, 0);
       p.rect(80, 200, 80, 80);

// to the left of top middle wall
       p.fill(255, 255, 0);
       p.rect(200, 80, 120, 80);

// top middle wall
       p.fill(255, 255, 0);
       p.rect(360, 40, 80, 120);

//  to the right of top middle wall
       p.fill(255, 255, 0);
       p.rect(480, 80, 120, 80);

// top right block
       p.fill(255, 255, 0);
       p.rect(640, 80, 80, 80);

// under top right block
       p.fill(255, 255, 0);
       p.rect(640, 200, 80, 80);

// under top middle wall
       p.fill(255, 255, 0);
       p.rect(320, 200, 160, 80);
       p.fill(255, 255, 0);
       p.rect(280, 200, 240, 40);

//
       p.fill(255, 255, 0);
       p.rect(200, 200, 40, 160);
       p.fill(255, 255, 0);
       p.rect(200, 280, 80, 40);

//
       p.fill(255, 255, 0);
       p.rect(560, 200, 40, 160);
       p.fill(255, 255, 0);
       p.rect(520, 280, 80, 40);

       /*bottom half*/

// bottom left wall
       p.fill(255, 255, 0);
       p.rect(80, 680, 160, 40);

// bottom middle wall
       p.fill(255, 255, 0);
       p.rect(280, 680, 240, 40);

// bottom right wall
       p.fill(255, 255, 0);
       p.rect(560, 680, 160, 40);

// bottom left block
       p.fill(255, 255, 0);
       p.rect(80, 640, 80, -120);

// to the left of keyblock
       p.fill(255, 255, 0);
       p.rect(200, 560, 120, 80);

// bottom middle keyblock
       p.fill(255, 255, 0);
       p.rect(360, 520, 80, 120);
       p.fill(255, 255, 0);
       p.rect(280, 480, 240, 40);
       p.fill(255, 255, 0);
       p.rect(200, 560, 120, 80);

// to the right of keyblock
       p.fill(255, 255, 0);
       p.rect(480, 560, 120, 80);

// bottom right block
       p.fill(255, 255, 0);
       p.rect(640, 640, 80, -120);

       p.fill(255, 255, 0);
       p.rect(200, 440, 40, 80);

       p.fill(255, 255, 0);
       p.rect(560, 440, 40, 80);
   }
}
