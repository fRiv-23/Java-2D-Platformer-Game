/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;

public class Brownbear {//Start Class

    private int x;
    private int y;   
    Color lightb = new Color(179,99,43);//Light Brown 
    Color mediumb = new Color(115,64,28);//Medium Brown 
    Color darkb = new Color(77,43,18);//Dark Brown     
   
    public Brownbear(int x, int y) {//Start
        this.x = x;
        this.y = y;
        //Colors for the bear
        
    }//End

    public void show(Graphics g) {
        //Left Arm
        g.setColor(darkb);
        g.fillRect(x + 190, y + 205, 15, 25);
        g.fillOval(x + 186, y + 200, 25, 35);

        //Right Arm
        g.fillRect(x + 224, y + 205, 15, 25);
        g.fillOval(x + 219, y + 200, 25, 35);

        //Legs
        g.fillArc(x + 210, y + 190, 25, 60, 180, 180);//Right Leg
        g.fillArc(x + 195, y + 190, 25, 60, 180, 180);//Right Leg

        //Feet
        g.fillArc(x + 200, y + 246, 12, 12, 0, 180);//Left foot
        g.fillArc(x + 217, y + 246, 12, 12, 0, 180);//Left foot

        g.setColor(lightb);
        g.fillOval(x + 192, y + 185, 47, 60);//body
        g.fillOval(x + 192, y + 160, 45, 40);//head
        
        
        g.setColor(darkb);
        g.fillArc(x + 192, y + 188, 47, 45, 0, 180);//shoulders
        g.fillOval(x + 195, y + 157, 12, 12);//Left Ear
        g.fillOval(x + 224, y + 157, 12, 12);//Right Ear
        g.drawOval(x + 195, y + 157, 13, 13);//Outline of Left Ear
        g.drawOval(x + 224, y + 157, 12, 12);//Outline of Right Ear
        //g.drawOval(x + 192, y + 160, 46, 41);//Outline of Head

        g.setColor(lightb);
        g.fillOval(x + 192, y + 160, 45, 40);
        g.fillOval(x + 192, y + 206, 45, 20);//creates white curve for upper body
        g.setColor(darkb);
        g.fillOval(x + 218, y + 168, 13, 18);//eye 
        g.fillOval(x + 202, y + 168, 13, 18);//eye 
        //g.fillOval(x + 216, y + 174, 15, 15);//eye
        //g.fillOval(x + 200, y + 174, 15, 15);//eye
        g.setColor(Color.white);
        g.fillOval(x + 220, y + 173, 10, 10);//white eye
        g.fillOval(x + 204, y + 173, 10, 10);//white eye  
        g.setColor(darkb);
        g.fillOval(x + 222, y + 175, 5, 5);//pupil
        g.fillOval(x + 207, y + 175, 5, 5);//pupil

        g.fillOval(x + 210, y + 187, 10, 5);//nose
        g.fillArc(x + 210, y + 188, 10, 10, 0, -180);//mouth

    }
    public int getX()
    {// start getX
        return x;
    }// end getX
    
    public void setX(int newX)
    {
        x=newX;
    }
    public int getY()
    {// start getY
        return y;
    }// end getY
    
    public void setY(int newY)
    {
        y=newY;
    }      
    
}
