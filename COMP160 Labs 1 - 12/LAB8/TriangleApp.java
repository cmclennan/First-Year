/** LAB 8
  * Triangle App Class
  * Cameron M
  * August 2016
  * */
/** import DecimalFormat
  * @param imports Decimal Format */
import java.text.DecimalFormat;

/** Create TriangleApp class
  * @param creates the app that Triangle class supports */
public class TriangleApp{
  public static void main(String[]args){
/** creates triangles that will be called upon
  * @param assigns triangles to new letters */    
    Triangle a = new Triangle(0,3,3,4,1,9,"A");
    Triangle b = new Triangle(4,2,9,4,6,7,"B");
    Triangle c = new Triangle(1,10,9,7,9,10,"C");

    DecimalFormat df = new DecimalFormat("0.00");
/** prints out pre defined sentence, calling upon variables from the support class
  * @param prints out parameter of triangle in required format */ 
    System.out.println("Triangle " + a.getName() + " perimeter is " + df.format(a.getPerimeter()) + " units");
    System.out.println("Triangle " + b.getName() + " perimeter is " + df.format(b.getPerimeter()) + " units");
    System.out.println("Triangle " + c.getName() + " perimeter is " + df.format(c.getPerimeter()) + " units"); 
  
 }// end method
}// end class


