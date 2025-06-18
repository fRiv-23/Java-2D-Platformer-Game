//Fernando Rivera SnowPeople Final Project
package nb.test.gamepackagev1;

import edu.sjcny.gpv1.*;
import static edu.sjcny.gpv1.DrawableAdapter.showGameBoard;
import java.awt.*;

public class NBTestGamePackageV1 extends DrawableAdapter {  // start class 

    static NBTestGamePackageV1 ge = new NBTestGamePackageV1();
    static GameBoard gb = new GameBoard(ge, "Honey Collector");
    static Brownbear Yogi = new Brownbear(200, 240);
    static Honeybee[] bee = new Honeybee[10];
    static Titlescreen Title = new Titlescreen(0, 0);
    static Winscreen Win = new Winscreen(0, 0);
    static Gameover Over = new Gameover(0, 0);
    static Game gg = new Game(0, 0);
    int count = 15;

    public static void main(String[] args) {
        int xx, yy;//x and y coordinates for honeybee array
        for (int i = 0; i < bee.length; i++) {// start for 
            xx = (int) (Math.random() * 300);
            yy = (int) (Math.random() * 300);
            bee[i] = new Honeybee(xx, yy);
        }// end for    
        showGameBoard(gb);
        Color sky = new Color(135, 206, 235); // Sky Blue        
        gb.setBackground(sky);
    }

    public void draw(Graphics g) {
        if (Title.getVisible()) {
            Title.show(g);
        } else if (gg.getVisible()) {
            gg.show(g);
            Yogi.show(g);
            //g.drawString("Timer: " + count, 50, 50);
            boolean allBeesCollided = true;//Created to check for all bees
            for (int i = 0; i < bee.length; i++) {
                bee[i].show(g);
                int diffX = Yogi.getX() - bee[i].getX();
                int diffY = Yogi.getY() - bee[i].getY();

                if (diffX <= 0 && diffY <= 0) {
                    //System.out.println("Collision between Yogi and Bee " + i); //debugging          
                    bee[i].setVisible(false); // Sets visibility of the individual bee 

                } else {
                    allBeesCollided = false;
                }
                g.drawString("Timer: " + count, 50, 50);
            }
            if (allBeesCollided) {
                Win.show(g);
            }
        }

    }

    //Button Methods
    public void upButton() {
        moveUp(Yogi);
    }

    public void rightButton() {
        moveRight(Yogi);
    }

    public void leftButton() {
        moveLeft(Yogi);
    }

    public void downButton() {
        moveDown(Yogi);
    }

    //Move methods
    public void moveLeft(Brownbear aBrownbear) {
        int currentX = aBrownbear.getX();
        currentX -= 10;
        aBrownbear.setX(currentX);
    }

    public void moveRight(Brownbear aBrownbear) {
        int currentX = aBrownbear.getX();
        currentX += 10;
        aBrownbear.setX(currentX);
    }

    public void moveUp(Brownbear aBrownbear) {
        int currentY = aBrownbear.getY();
        currentY -= 10;
        aBrownbear.setY(currentY);
    }

    public void moveDown(Brownbear aBrownbear) {
        int currentY = aBrownbear.getY();
        currentY += 10;
        aBrownbear.setY(currentY);
    }

    public void keyStruck(char key) {
        switch (key) {
            case 'A':
            case 'a': {
                moveLeft(Yogi);
                break;
            }
            case 'D':
            case 'd': {
                moveRight(Yogi);
                break;
            }
            case 'S':
            case 's': {
                moveDown(Yogi);
                break;
            }
            case 'W':
            case 'w': {
                moveUp(Yogi);
                break;
            }
            case 'E':
            case 'e': {
                Title.setVisible(false); //set title screen to false
                gg.setVisible(true);   //set game screen to true             
                break;
            }
        }
    }

    public void timer1() {//start timer method

        count--;
        if (count <=0 ) {
            gb.stopTimer(1);
            //Over.show(g);//display game over screen
            System.exit(0);
        }
    }//end timer method

}
