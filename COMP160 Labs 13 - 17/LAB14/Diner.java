/**LAB14 COMP160
  * September 2016
  * Cameron M
  */

import javax.swing.*;
import java.awt.*;

/** Creates Diner support class, initialises variables, and sets fonts and placements
  * @param Creates Diner support class, initialises variables and sets fonts and placements */
public class Diner{
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int diamater = 50;
  
  // this reference method
  public Diner (int x, int y, String name, int seatNum, Color colour){
    this.x = x;
    this.y = y;
    this.name = name;
    this.colour = colour;
    this.seatNum = seatNum;
  }// end method
  
  public void draw(Graphics g){
    
    g.setColor(colour);
    g.fillOval(x,y, diamater, diamater);
    //sets font colour
    g.setColor(Color.black);
    g.setFont(new Font("Courier", Font.BOLD, 10));
    g.drawString(name, x + (7),y + (28));
    
    g.setFont(new Font("Helvetica", Font.BOLD, 14));
    g.drawString(Integer.toString(this.seatNum),x + 21,y + 13);
  }// end method  
}// end class
              

  