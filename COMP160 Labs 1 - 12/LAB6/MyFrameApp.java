import javax.swing.*;
import java.awt.*;

public class MyFrameApp {
  
  

  
  public static void main(String[] args){
    MyFrame m1 = new MyFrame();  // creates a new Frame
    m1.setSize(300, 150); // Sets frame size
    m1.setVisible(true); // Sets frame visible
    m1.decorate(Color.pink, "Hello world", 180); // Sets frame color, title and y-axis location
    
    MyFrame m2 = new MyFrame();  // creates a new Frame
    m2.setSize(300,200); // Sets frame size
    m2.setVisible(true); // Sets frame visible
    m2.decorate(Color.blue, "Hello again, world", 400); // Sets frame color, title and y-axis location
  }
  

}
  

  
