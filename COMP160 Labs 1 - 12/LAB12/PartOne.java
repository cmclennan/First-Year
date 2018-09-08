/** Lab 12 COMP160
  * Cameron M
  * August 2016
  * finds the sum of even numbers inbetween 2 and the user entered value
  */

import java.util.Scanner;


public class PartOne {
  
  /** Creates main loop where variables are stored and the if/while loop is run
    * @param runs main which runs the number reader and checks to see if the user entered value meets parameters and
    * outputs a value depending on the user entered value */
  
  public static void main(String [] args) {
    int sum = 0;
    int base  = 2;
    int value = readNum("Enter a number greater than 1: ");
    
    if (value <= base) System.out.println("The number must be larger than 1."); // error statement print out if number isnt bigger than 2
    else {
      while (base <= value) {
        sum += base;
        base += 2;
      }
      
      System.out.println("The sum of even numbers between 2 and " + value + " is: " + sum); // final print out of sum of numbers between base and value variables
    }
  }// end method

  /** creates the scanner to scan user entries
    * @param runs the readNum scanner creator to scan for user inputs */
  public static int readNum(String output){
    Scanner scan = new Scanner(System.in);
    System.out.print(output);
    return scan.nextInt();
  }//end method
}// end class
      
      