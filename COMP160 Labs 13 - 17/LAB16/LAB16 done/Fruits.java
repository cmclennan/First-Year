/** Lab 16 COMP160
  * Cameron M
  * September 2016
  */
import java.util.Scanner;


public class Fruits {
  /** main loop: initialises array, calls for and stores user input. Also contains fruit guess for loop
    * @param initalises array, calls for and stores user input - runs fruit guess loop */
  public static void main(String [] args) {
    String [] fruits = new String [3];
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < fruits.length; i++) {
      System.out.println("Enter a fruit");
      fruits[i] = input.nextLine();
      
    }
   for(String x : fruits){// fruit guess loop
      System.out.println("Guess what fruit I am? " + "\t" + x.substring(0, 2)  + "\t"+ x.length() + " letters" ); // prints out first two letters of first fruit
      Scanner input2 = new Scanner(System.in); // scanner for user input
      String guess = input2.nextLine(); // stores user input as a string
      while (! x.equals(guess)) {// comparison loop to see if users guess matches the fruit - runs until user guesses correctly
        System.out.println("Try again");
        guess = input2.nextLine();  
      }
      System.out.println("Correct");// prints correct if user guesses fruit correct
   }// end method
  }

}// end class










    
    
    
    
    
    
