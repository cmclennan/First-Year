/**LAB14 COMP160
  * September 2016
  * Cameron M
  */
import javax.swing.*;
import java.awt.*;

public class TableApp{
/** executing statement for TablePanel and renders TablePanel
  * @param execution class. renders TabelPanel */
  
  public static void main(String[]args){
  //creates instance of JFrame
    JFrame frame = new JFrame("Table");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
 //calls table panel   
    frame.getContentPane().add(new TablePanel());
  
  
  
    frame.pack();
    frame.setVisible(true);
  }// end method
}// end class
