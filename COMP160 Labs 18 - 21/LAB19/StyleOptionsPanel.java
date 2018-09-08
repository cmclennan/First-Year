/** LAB19
  * COMP160
  * September 2016
  * Cameron M
  * Main panel for StyleOptions to call on
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.GridLayout;

public class StyleOptionsPanel extends JPanel {
  // creates private variables to be used
   private JLabel saying;
   private JCheckBox bold, italic;
   private JRadioButton courier, times, helvetica;
   private int style = Font.PLAIN;
   private String typeFace = "Helvetica";
   private JPanel panel;
   private ButtonGroup group;


   //  Sets up a panel with a label and some check boxes that controls the style of the label's font.
   public StyleOptionsPanel() {
  
      saying = new JLabel ("Say it with style!");


      // creates instances of check boxes and radio buttons
      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);
      courier = new JRadioButton ("Courier");//
      courier.setBackground (Color.cyan);
      times = new JRadioButton ("Times New Roman");//
      times.setBackground(Color.cyan);
      helvetica = new JRadioButton ("Helvetica");
      helvetica.setBackground(Color.cyan);

      //creates listeners to listen for inputs in check boxes and radio buttons
      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);

      StyleListenerOne listener1 = new StyleListenerOne();
      courier.addActionListener (listener1);
      times.addActionListener (listener1);
      helvetica.addActionListener (listener1);
      
      
      //creates a new panel to add all the buttons to
      panel = new JPanel();
      panel.setPreferredSize (new Dimension(250, 300));
      panel.setBackground (Color.cyan);
      //adding boxes to panel
      panel.setLayout (new GridLayout(7,1));
      panel.add (saying);
      panel.add (bold);
      panel.add (italic);
      panel.add (courier);
      panel.add (times);
      panel.add (helvetica);
     
      //button group
      ButtonGroup group = new ButtonGroup();
      group.add(courier);
      group.add(times);
      group.add(helvetica);
      
      // creates main window that the panel gets added to
      setPreferredSize (new Dimension(250, 300));
      setBackground (Color.cyan);
      add(panel);
   }// end method
   

   
   /** represents the listener for both check boxes
     * @param represents the listener for both check boxes */
   private class StyleListener implements ItemListener {

      //  Updates the style of the label font style.
      public void itemStateChanged (ItemEvent event) {
         style = Font.PLAIN;

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC; 
         
         saying.setFont(new Font (typeFace, style, 20));
         
      }// end method  
   }// end class
   
   /** creates an action listener for radio buttons
     * @param creates an action listener for radio buttons */
   private class StyleListenerOne implements ActionListener {
     
     public void actionPerformed (ActionEvent event) {

     if (event.getSource() == times) {
       typeFace = "Times New Roman"; // sets font to times new roman
     } else if (event.getSource() == courier) {
       typeFace = "Courier";// sets font to courier
     } else if (event.getSource() == helvetica) {
       typeFace = "Helvetica";// sets font to helvetica
     }saying.setFont(new Font (typeFace, style, 20));
     } 
   }
} // end class


