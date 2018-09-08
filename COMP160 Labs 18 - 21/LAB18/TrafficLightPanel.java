/** LAB 18
  * COMP160
  * Cameron M
  * September 2016
  */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** main support panel for traffic light app - draws buttons, adds listeners for them and creates objects
  * @param draws buttons, adds listeners and creates objects */

public class TrafficLightPanel extends JPanel { // main class for traffic light panel - holds all objects used
  private JButton red, green, amber;
  private JLabel buttonLabel, lastPressed; // private variables
  private JPanel buttonPanel;
  
  public TrafficLightPanel() {
    
    red = new JButton("Red");// accessing private variables
    amber = new JButton("Amber");
    green = new JButton("Green");
    
    ButtonListener listener = new ButtonListener();
    red.addActionListener(listener); // listener to listen for button presses
    amber.addActionListener(listener);
    green.addActionListener(listener);
    
    buttonLabel = new JLabel();
    lastPressed = new JLabel("Last pressed");

    LightPanel panel = new LightPanel(); // new instance of LightPanel
    panel.setPreferredSize(new Dimension(80, 290));//dimensions of LightPanel
    panel.setBackground(Color.cyan);//Colour of LightPanel
    
    buttonPanel = new JPanel();//panel for buttons to be added to and confined within
    buttonPanel.setPreferredSize(new Dimension(80, 290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(red);// adding buttons
    buttonPanel.add(amber);
    buttonPanel.add(green);

    setPreferredSize(new Dimension(200,300));//sets size of main window
    setBackground(Color.blue);
    add(buttonLabel);// adds button panels and panel which is what the new instance of LightPanel is called
    add(buttonPanel);
    add(panel);
  }// end method
  
  /** LightPanel class for setting circles and deciding when they get their colours changed
    * @param sets circles and decides when they get changed via an if-else loop */
  private class LightPanel extends JPanel { // LightPanel Class
    public void paintComponent (Graphics light) {
      super.paintComponent(light);
      light.setColor (Color.black);// initialises colour and applies it to a circle
      light.fillOval( 20, 30, 40, 40);// intialises a circle with position and size
      light.setColor (Color.black);
      light.fillOval( 20, 90, 40, 40);
      light.setColor (Color.black);
      light.fillOval( 20, 150, 40, 40);
      if (lastPressed.getText().toString().equals("Red")){// if- else loop to change colour of lights when buttons are pressed
        light.setColor(Color.red);
        light.fillOval (20, 30, 40, 40); 
      } else if (lastPressed.getText().equals("Amber")){
        light.setColor(Color.orange);
        light.fillOval(20,90,40,40);
      } else if (lastPressed.getText().equals("Green")){
        light.setColor(Color.green);
        light.fillOval(20,150,40,40);
      }    
    }
  }// end method
  
  private class ButtonListener implements ActionListener { //listens for button presses and changes a variable that LightPanel's if else loop uses
    public void actionPerformed (ActionEvent event) {
      if (event.getSource() == red) { // if button with red on it is pressed, sets lastPressed variable to "Red" for LightPanel if-else loop
        lastPressed.setText("Red");
      } else if (event.getSource () == amber) {
        lastPressed.setText("Amber");
      } else if (event.getSource () == green) {
        lastPressed.setText("Green");
      }
      repaint();// repaint call to repaint each time a button is clicked
    }
  }// end method
}// end class


          
 