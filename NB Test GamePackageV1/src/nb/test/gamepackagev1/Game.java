/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Graphics;

public class Game{//Start Class

    int x;
    int y;
    private boolean visible = false;
    

    public Game(int x, int y) {//Start
        this.x = x;
        this.y = y;
        
    }//End

    public void show(Graphics g) {//Start show method
        g.setColor(Color.lightGray);
        g.fillRect(x+0, y+0, 500, 500);
               
    }//end show method

   
        public boolean getVisible()
    {
    return visible;
    }

 public void setVisible(boolean newVisible)
    {
    visible = newVisible;
    }
}//end class
