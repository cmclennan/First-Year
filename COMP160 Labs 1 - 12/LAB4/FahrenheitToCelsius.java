import java.util.Scanner;
/**Lab 4 COMP160 S2 2016
 * Starting code
 */

import java.util.Scanner;
public class FahrenheitToCelsius{
  public static void main(String[]args){
    convertFToC();
    convertFToC(); //Second call for user entry 
    convertFToC(); //Third call for user entry
    //Step 5;
  }

  /** gets input from user representing fahrenheit and displays celsius equivalent*/
  public static void convertFToC(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Fahrenheit temperature");
    double fahrenheit =  scan.nextDouble();           ; //Step 2 - assign next double input from Scanner object
    System.out.println(fahrenheit + " degrees Fahrenheit is "+ toCelsius(fahrenheit) + " degrees Celsius"  ); //Step 4 (Returns fahrenheit entry converted to celsius)
  }


  /** calculates and returns the celsius equivalent of a double input parameter called fahrenheit*/
  public static double toCelsius(double fahr){
    final int BASE = 32;
    final double CONVERSION_FACTOR = 9.0/ 5.0;
    double celsius = ((fahr - BASE) / CONVERSION_FACTOR); //Step 3 (Conversion formula)
    return celsius;
  }
}
