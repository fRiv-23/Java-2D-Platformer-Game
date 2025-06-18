/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Winscreen {//Start Class

    private int x;
    private int y;   
    Color Gold = new Color(255, 215, 0);//Gold   
    
    public Winscreen(int x, int y) {//Start
        this.x = x;
        this.y = y;
           
        
        
    }//End

    public void show(Graphics g) {
        //Fonts
        Font titleFont = new Font("TimesRoman", Font.BOLD, 72);
        Font messageFont = new Font("TimesRoman", Font.BOLD, 14);

        //Background
        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 500);
        //Title
        g.setFont(titleFont);
        g.setColor(Gold);
        g.drawString("!!!Winner!!!", 65, 150);
        g.drawString("", 110, 180);

        //Message underneath title    
        g.setColor(Color.white);
        g.fillRect(145, 220, 235, 60);
        g.setColor(Gold);
        g.setFont(messageFont);
        g.fillRect(0, 0, 0, 0);
        g.drawString("GREAT WORK!", 205, 250);
        g.drawString("You collected all the Honeybees!", 150, 265);
        

    }
}//End class
