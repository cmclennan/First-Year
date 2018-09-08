/**
 Pie.java
 Provided for Part 2, Lab5, COMP160 2016 
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /** creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);

    }
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
        page.setColor(Color.white);
        page.fillRect(0,0,300,220);
        //your pie chart code goes here
        final int CENTRE_X =110; // sets an X-axis centre point
        final int CENTRE_Y = 90; // sets a Y-axis centre point
        final int ANGLE_ARC = 45; // sets arc angle
        final int WIDTH_ARC= 90; // sets arc width
        final int HEIGHT_ARC = 90; // sets arc height
        final int START_ARC = 0; // start angle for arc
        page.setColor(Color.black);
        page.fillArc(CENTRE_X + 5, CENTRE_Y - 2, WIDTH_ARC, HEIGHT_ARC, START_ARC , ANGLE_ARC); // draws an arc filled with black
        page.setColor(Color.blue);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 45 , ANGLE_ARC); // draws an arc filled with blue
        page.setColor(Color.red);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 90 , ANGLE_ARC); // draws an arc filled with red
        page.setColor(Color.magenta);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 135 , ANGLE_ARC); // draws an arc filled with magenta
        page.setColor(Color.yellow);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 180 , ANGLE_ARC); // draws an arc filled with yellow
        page.setColor(Color.green);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 225 , ANGLE_ARC); // draws an arc filled with green
        page.setColor(Color.orange);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 270 , ANGLE_ARC); // draws an arc filled with orange
        page.setColor(Color.lightGray);
        page.fillArc(CENTRE_X, CENTRE_Y, WIDTH_ARC, HEIGHT_ARC, START_ARC + 315 , ANGLE_ARC); // draws an arc filled with light gray


    }
    
}
