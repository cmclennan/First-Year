/** LAB21
  * COMP160
  * Cameron M
  * October 2016
  * shape drawing support panel; initialises variables, sets shape parameters 
  */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
/** initialises variables, creates shape constructor
  * @param initialises variables and creates shape constructor */
public class Shape {
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  // shape constructor
  public Shape() {
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, (400-width));
    y = randomRange(0, (400-height));
    colour = new Color((randomRange(0, 255)),(randomRange(0, 255)),(randomRange(0, 255)));
  }// end method
  // random generator for shape constructor
  public int randomRange(int lo, int hi){
    Random r = new Random();
    int result = r.nextInt((hi - lo) + 1) + lo;
    return result;
    
  }// end method
  
  // graphics display to draw from shape
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillOval(x ,y ,width ,height);
  }// end method
}// end class