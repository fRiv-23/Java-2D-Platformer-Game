/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;
import static nb.test.gamepackagev1.NBTestGamePackageV1.gb;



public class Gameover {//Start Class

    private int x;
    private int y;
    private boolean visible = true;
    
    public Gameover(int x, int y) {//Start
        this.x = x;
        this.y = y;
    }//End

    public void show(Graphics g) {//Start show method
        //Game Over Letter Color
//        g.setColor(Color.WHITE);
//        g.fillRect(x + 90, y + 100, 270, 60);
//        g.fillRect(x + 90, y + 200, 270, 60);
        g.setColor(Color.red);
        //The letter G
        g.fillRect(x + 100, y + 100, 50, 10);
        g.fillRect(x + 135, y + 110, 20, 10);
        g.fillRect(x + 95, y + 110, 15, 45);
        g.fillRect(x + 100, y + 150, 50, 10);
        g.fillRect(x + 140, y + 130, 15, 20);
        g.fillRect(x + 130, y + 130, 20, 10);

        //Letter A
        g.fillRect(x + 180, y + 100, 30, 10);
        g.fillRect(x + 170, y + 110, 20, 10);
        g.fillRect(x + 200, y + 110, 20, 10);
        g.fillRect(x + 165, y + 120, 20, 40);
        g.fillRect(x + 205, y + 120, 20, 40);
        g.fillRect(x + 180, y + 130, 25, 10);

        //Letter M
        g.fillRect(x + 232, y + 100, 20, 10);
        g.fillRect(x + 232, y + 110, 25, 10);
        g.fillRect(x + 232, y + 120, 60, 10);
        g.fillRect(x + 257, y + 130, 10, 10);
        g.fillRect(x + 272, y + 100, 20, 10);
        g.fillRect(x + 267, y + 110, 25, 10);
        g.fillRect(x + 232, y + 130, 20, 30);
        g.fillRect(x + 272, y + 130, 20, 30);

        //Letter E
        g.fillRect(x + 300, y + 100, 15, 60);
        g.fillRect(x + 310, y + 100, 40, 10);
        g.fillRect(x + 310, y + 125, 30, 10);
        g.fillRect(x + 310, y + 150, 40, 10);

        //Letter O
        g.fillRect(x + 95, y + 210, 20, 40);
        g.fillRect(x + 103, y + 200, 40, 10);
        g.fillRect(x + 135, y + 210, 18, 40);
        g.fillRect(x + 103, y + 250, 40, 10);

        //Letter V
        g.fillRect(x + 160, y + 200, 20, 40);
        g.fillRect(x + 170, y + 240, 20, 10);
        g.fillRect(x + 175, y + 250, 30, 10);
        g.fillRect(x + 195, y + 240, 20, 10);
        g.fillRect(x + 205, y + 200, 20, 40);

        //Letter E
        g.fillRect(x + 235, y + 200, 15, 60);
        g.fillRect(x + 245, y + 200, 45, 10);
        g.fillRect(x + 245, y + 225, 35, 10);
        g.fillRect(x + 245, y + 250, 45, 10);

        //Letter R
        g.fillRect(x + 300, y + 200, 15, 60);
        g.fillRect(x + 310, y + 200, 35, 10);
        g.fillRect(x + 340, y + 210, 10, 25);
        g.fillRect(x + 310, y + 230, 30, 10);
        g.fillRect(x + 325, y + 240, 20, 10);
        g.fillRect(x + 330, y + 250, 20, 10);
        
        gb.setBackground(Color.BLACK);
        
       }//end show method        
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean newVisible) {
        visible = newVisible;
    }

}
