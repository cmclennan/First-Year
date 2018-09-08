/** Leap Year Application class
  * Lab 10 COMP160
  * Cameron M
  * August 2016
  */
public class LeapYearApp {
  
  /** Begins main loop where variables are stored */
  public static void main(String [] args) {
    
    leapYear(2014);
    leapYear(2000);
    leapYear(2016);
    leapYear(1900);
    leapYear(1200);
    
    System.out.println("----");
    
    
    
    leapYear(1904);
    leapYear(1905);
    leapYear(1972);
    leapYear(1944);
    leapYear(1952);
    leapYear(1943);
    
  }
  
  /** Begins method that calculates whether or not leapYear variable is a leap year and prints a statement
    * @param runs leapYear check loop and print loop */  
  public static void leapYear(int year) {
    
    boolean isLeap = false;

    if ((year > 1582) && (( year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {
      isLeap = true;
    } else {
      isLeap = false;
    }

    if (isLeap) {
      System.out.println( year + ": is a leap year");
    } else if (year < 1582) {
      System.out.println( year + ": predates the Gregorian calendar");
    }else {
      System.out.println( year + ": is not a leap year");
    }
  }// end method
}// end class


