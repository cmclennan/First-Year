/**LAB14 COMP160
  * September 2016
  * Cameron M
  */
import javax.swing.*;
import java.awt.*;

/** Creates TabelPanel Class with JPanel and assigns values to diners variables defined in Diner class and draws everything
  * @param TabelPanel Class created, assigns values to new diners and draws everything */

public class TablePanel extends JPanel{
  private Diner diner1, diner2, diner3, diner4, diner5, diner6; // diners stored as private
  
  
  public TablePanel(){// creates new instances of diners
    diner1 = new Diner(175, 75 , "David" ,1, Color.cyan);   
    diner2 = new Diner(300, 225 ,"Clare", 2, Color.green);                   
    diner3 = new Diner(300, 325, "Michael", 3, Color.yellow);
    diner4 = new Diner(175, 475, "Metiria", 4, Color.white);                     
    diner5 = new Diner(50, 325, "Todd", 5, Color.red);
    diner6 = new Diner(50, 225, "jacqui", 6,Color.pink);                   
  }// end method

  public void paintComponent(Graphics d){//draws diners
    super.paintComponent(d);
    
    diner1.draw(d);
    diner2.draw(d);
    diner3.draw(d);
    diner4.draw(d);
    diner5.draw(d);
    diner6.draw(d);
    
    d.setColor(Color.black);
    d.fillRect(150,200,100,200);
  }//end method
}// end class
                       
                         
                         
                         