import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
/**  
 * Lab 6, Part 1, COMP160
 * MyFrame.java
 * Make our own version of a JFrame class
 */
public class MyFrame extends JFrame {
  /** Make our own paint method */
  /** creates a paint method that renders an image on the screen */
  public void paint(Graphics g) { /** begins paint method */
    g.drawRect(50,50,40,40);       // square
    g.drawRect(60, 80, 225, 30);   // rectangle       
    g.drawOval(75, 65, 20, 20);    // circle
    g.drawLine(35, 60, 100, 120);  // line
    g.drawString("Out of clutter, find simplicity", 110, 70); /** Defines a string and places it within the JFrame */
    g.drawString("-- Albert Einstein", 130, 100); /** Defines another string and places it in another spot within the JFrame */


  }//end paint
/** creates a decorate method bas that will be used as a support for the My FrameApp
  * @param shade background color
  * @param title sets title of app
  * @param yOffset sets y-axis offset for the app */
  public void decorate(Color shade, String title, int yOffset) {
    setBackground(shade); /** sets background color */
    setTitle(title); /** sets title of the App */
    setLocation(0, yOffset); /** sets location of app on the screen */
  } /** end decorate method */
  

}//end class
