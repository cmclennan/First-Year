/** LAB19
  * COMP160
  * September 2016
  * Cameron M
  *  A simple text based application front end to Calculator
  */

public class CalcTextApp {  

 // create an instance of the Calculator class
 private static Calculator c = new Calculator();

 /** Main method - performs a simple calculation on the calculator */ 
 public static void main(String[] args) {
  // A simple calculation, 234 - 72 =  
  c.inDigit(2);
  c.inDigit(3);
  c.inDigit(4);
  c.inOperator("-");
  c.inDigit(7);
  c.inDigit(2);
  c.inEquals();
  System.out.println( "234 - 72 = " + c.getResult()); 
  c.inClear();
 }// end method 

}// end class  

