import processing.core.PApplet;

public class Board {

    private PApplet p;

    public Board(PApplet p)
    {
        this.p = p;
    }

    public void drawBoard()
    {
        p.rect(200, 200, 50, 50);

    }
    // private Random rnd;
//    private int width;
//    private int height;
//    private int[][] board;
//
//    //private Keys keys;
//
//    private int playerLife;
//    private int player2Life;//NY
//
//    Board(int width, int height, int numberOfEnemies, int numberOfFoods)
//    {
//        if (width < 10 || height < 10)
//        {
//            throw new IllegalArgumentException("Width and height must be at least 10");
//        }
//
//        if (numberOfEnemies < 0) {
//            throw new IllegalArgumentException("Number of enemies must be positive");
//        }
//
//        // this.rnd = new Random();
//        this.board = new int[width][height];
//        this.width = width;
//        this.height = height;
//        //keys = new Keys();
//        //player = new Dot (0, 0, width-1, height-1);
//        //player2 = new Dot(24, 0, width-1, height-1);//NY
//        //enemies = new Dot[numberOfEnemies];
//        //foods = new Dot [numberOfFoods];
//
//        /*for (int i = 0; i < numberOfEnemies; ++i) {
//            ghost[i] = new Dot(width - 1, height - 1, width - 1, height - 1);
//        }*/
//       /* for (int i=0; i< numberOfFoods; ++i)
//        {
//            foods[i] = new Dot(width/2, height/2, width-1, height-1);
//        }
//        this.playerLife = 100;
//        this.player2Life= 100;//NY
//    }*/
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void update() {
////            updatePlayer();
////            updatePlayer2();//NY
////            updateEnemies();
////            updateEnemies2();//NY
////            updateFoods();
////            updateFoods1();//NY
////            checkForCollisionsp1();
////            checkForCollisionsp2();
////            checkForHealingp1();
////            checkForHealingp2();
////            updateFoods();
////            clearBoard();
////            populateBoard();
//    }
//
//    public int[][] getBoard() {
//        //ToDo: Defensive copy?
//        return board;
//    }
//
//    private void clearBoard() {
//        for (int y = 0; y < height; ++y) {
//            for (int x = 0; x < width; ++x) {
//                board[x][y] = 0;
//            }
//        }
//    }
}

