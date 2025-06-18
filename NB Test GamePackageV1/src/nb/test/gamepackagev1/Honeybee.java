/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;

public class Honeybee {//Start Class

    int x;
    int y;
    private boolean visible = true;
    Color Honey = new Color(249, 201, 1);//Honey 

    public Honeybee(int x, int y) {//Start
        this.x = x;
        this.y = y;

    }//End

    public void show(Graphics g) {//Start show method
       if(visible){ //Honeybee
        //feet
        g.drawLine(x + 115, y + 135, x + 110, y + 145);
        g.drawLine(x + 115, y + 135, x + 120, y + 145);
        g.drawLine(x + 135, y + 135, x + 130, y + 145);
        g.drawLine(x + 135, y + 135, x + 140, y + 145);
        //Wings
        g.setColor(Color.white);
        g.fillOval(x + 120, y + 85, 10, 20);
        g.setColor(Color.black);
        g.drawOval(x + 120, y + 85, 10, 20);
        g.setColor(Color.white);
        g.fillOval(x + 115, y + 85, 10, 20);
        g.setColor(Color.black);
        g.drawOval(x + 115, y + 85, 10, 20);
        //body        
        g.setColor(Honey);
        g.fillOval(x + 100, y + 100, 50, 40);
        //stripes and face
        g.setColor(Color.black);
        g.fillRect(x + 120, y + 101, 10, 39);
        g.fillOval(x + 140, y + 110, 5, 5);
        g.drawArc(x + 140, y + 120, 10, 10, 180, 90);
        g.drawOval(x + 100, y + 100, 50, 40);
        g.fillArc(x + 100, y + 105, 20, 30, 90, 180);

        //stinger
        int[] xPoints = {x + 103, x + 95, x + 103}; // x
        int[] yPoints = {y + 110, y + 120, y + 130}; // y

        g.fillPolygon(xPoints, yPoints, 3);
       }
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
}//end class
