/** LAB19
  * COMP160
  * September 2016
  * Cameron M
  * window panel for StyleOptionsPanel 
  */
import java.awt.GridLayout;
import javax.swing.JFrame;

// main window
public class StyleOptions
{
  /** creates and presents the program frame
    * @param creates and presents the program frame */
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Style Options");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      StyleOptionsPanel panel = new StyleOptionsPanel();
      frame.getContentPane().add (panel);


      frame.pack();
      frame.setVisible(true);
   }// end method
}// end class
