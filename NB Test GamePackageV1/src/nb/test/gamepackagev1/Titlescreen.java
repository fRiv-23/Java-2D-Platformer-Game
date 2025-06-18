/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Titlescreen {//Start Class

    private int x;
    private int y;  
    private boolean visible = true;
    Color Sky = new Color(135, 206, 235);//Sky Blue      
    public Titlescreen(int x, int y) {//Start
        this.x = x;
        this.y = y;
           
        
        
    }//End

    public void show(Graphics g) {
        //Fonts
        Font titleFont = new Font("Dialog", Font.BOLD, 36);
        Font messageFont = new Font("Dialog", Font.PLAIN, 16);

        //Background
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);
        //Title
        g.setFont(titleFont);
        g.setColor(Sky);
        g.drawString("Welcome to", 130, 150);
        g.drawString("Bee Collector!", 120, 180);

        //Message underneath title
        g.setFont(messageFont);
        g.drawString("Your goal is to collect all the bees before time runs out.",50, 250);
        g.drawString("Goodluck!", 180, 280);
        g.drawString("Press E to Start", 160, 310);

    }
    public int getX()
   {
     return x;  
   }
    public int getY()
    {
      return y;
    }
    public void setX(int newX)
    {
      x = newX;  
    }
    public void setY(int newY)
    {
       y = newY; 
    }
        public boolean getVisible()
    {
    return visible;
    }

 public void setVisible(boolean newVisible)
    {
    visible = newVisible;
    }
}//End Class
