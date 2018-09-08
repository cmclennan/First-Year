import javax.swing.JFrame;

/** application for traffic light - calls TrafficLightPanels attributes and displays them
  * @param calls TrafficLightPanels attributes and displays them */

public class TrafficLight {
  public static void main(String [] args) {
    JFrame frame = new JFrame( "Traffic Lights");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TrafficLightPanel());
    frame.pack();
    frame.setVisible(true);
  }//end method
}// end class 