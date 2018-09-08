/** FilePanel.java
 * Lab 20, COMP160,  2016
 * Cameron M
 * a JPanel which creates 2 instances of Rectangle objects, 
 * stores them in an array, and draws them 
 */

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

// Main creator panel for Rectangle class
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
 

  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){ 

    String fileName;
    fileName = "LongBadData.txt";
    // try loop to scan file, initialise variables and fill constructor for rectangle
    try { 
      Scanner fileScan = new Scanner(new File(fileName));
      boolean bool;
      Color color;
      int fill;
      int colorNum;
      int x1;
      int y1;
      int x2;
      int y2;
      int num;
      // while there are other lines and there are less than the length of Rectangle array, this will execute
      while (fileScan.hasNextLine() && count < drawObjects.length) {
        // initialised variables for format loop
        String inputLine = fileScan.nextLine();
        color = Color.red;
        bool = false;
        // if loop to see if file lines match correct format
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){
          Scanner scan = new Scanner(inputLine);
          fill = scan.nextInt();
          colorNum = scan.nextInt();
          x1 = scan.nextInt();
          y1 = scan.nextInt();
          x2 = scan.nextInt();
          y2 = scan.nextInt();
        // if loop to check to see if object needs to be filled  
        if (fill == 1){
          bool = true;
        } else {
          bool = false;
        }
        // if loop to decide color depending upon colorNum variable
        if (colorNum == 1) {
          color = Color.red;
        } else if (colorNum == 2) {
          color = Color.blue;
        } else if (colorNum == 3) {
          color = Color.green;
        }
        drawObjects[count] = new Rectangle(bool,color, x1, y1,x2,y2);
        count++;
        } 
      }
    // catch exception if file isnt fount  
    } catch (FileNotFoundException e) {
      System.out.println("File not found. Check file name and location.");
      System.exit(1);
    } 
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);  
  }// end method
  
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }// end method
}// end class
  