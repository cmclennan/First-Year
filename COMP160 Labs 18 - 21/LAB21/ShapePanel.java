
  * shape drawing main panel; creates panels and renders everything to use
  */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** main class; holds frame creators, panels, paint components and listeners
  * @param main class; holds frame creators, panels, paint components and listeners to draw from Shape support class */
public class ShapePanel extends JPanel {
  private Shape [] shapes = new Shape[20];
  // variables from type swing initialised 
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private int count;
  private String convert;
  /** main method to create base window so everything can be seen 
    * @param main method to create base window so everything can be seen */
  public static void main(String [] args) {
    JFrame frame = new JFrame("Lab 21");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
    
  }
  //main panel that everything gets added to, instances of child panels are created within here
  public ShapePanel() {
    addShape = new JButton("Add Shape");
    countLabel = new JLabel("Count:");
    showNum = new JTextField(" " + count + " ");
    
    DrawingPanel drawPanel = new DrawingPanel();
   
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400)); // control panel details
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    setPreferredSize(new Dimension(600,450)); // main panel details
    add(controlPanel);
    add(drawPanel);
    
  }// end method
  /** sets shape panel dimensions and colour
    * @param sets shape panel dimensions and colour */
  private class DrawingPanel extends JPanel {
    public DrawingPanel() {
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.pink);
    }
    public void paintComponent(Graphics g) {
      super.paintComponent(g);   
      for (int x = 0; x < shapes.length ; x++){
        if(shapes[x] instanceof Shape) {
          shapes[x].display(g);
        }
      }
    }// end method   
  }// end method
 /** creates a button listener to listen for when a addShape button is pressed and reacts accordingly
   * @param creates a button listener to listen for when a addShape button is pressed and reacts accordingly */
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent e) {   
      if (e.getSource() == addShape) {
        if (count < shapes.length){
          shapes[count] = new Shape();
          count += 1;
        }   
      }
      convert = Integer.toString(count);
      showNum.setText(convert);
      repaint(); 
    }
  }// end method     
}// end class

  

