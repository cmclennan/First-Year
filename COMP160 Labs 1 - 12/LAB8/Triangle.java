/** LAB 8
  * Triangle Support Class
  * Cameron M
  * August 2016
  * */

/** initiates a class called Triangle
  *@param defines variable positions that triangle corners will sit */ 
public class Triangle {
 private int p1x;
 private int p1y;
 private int p2x;
 private int p2y;
 private int p3x;
 private int p3y;
 private String name;


 /** defines points for the triangle
   *@param sets pt1x to p1x, etc*/
 public Triangle (int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
   p1x = pt1x;
   p1y = pt1y;
   p2x = pt2x;
   p2y = pt2y;
   p3x = pt3x;
   p3y = pt3y;
   name = nameIn;   
 } // end method
 
 /** Calculates the length of sides for the triangle
   * @returns a formula for side length calculations*/
 private double calcSide( int x1, int y1, int x2, int y2) {
   return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
 } // end method

 /** gets perimiter lengths of the triangle
   * @ returns lengths  of entire parameter*/
 public double getPerimeter(){
   double lengthA = calcSide(p1x, p1y, p2x, p2y);
   double lengthB = calcSide(p2x, p2y, p3x, p3y);
   double lengthC = calcSide(p3x, p3y, p1x, p1y);
   return lengthA + lengthB + lengthC;
 } // end method
 
/** get the name of triangle
  * @returns a name */
 public String getName(){
   return name;
 } // end method
} // end class
 
 