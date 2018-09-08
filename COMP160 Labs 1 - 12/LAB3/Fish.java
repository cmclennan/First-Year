import java.util.Scanner; //importing a scanner that will be used for text input
/**
 * Lab 3, COMP160, 2016
 * Cameron, July 2016
 * This program prints out 4 verses of text, one of which is entered by a human.
 */


public class Fish{ //Begin class
 
  public static void main(String [] args){
    String verse4; // begin to create scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a line of text:");
    verse4 = scan.nextLine();
    System.out.println("You entered: \"" + verse4 + "\"" + "\n");
    
    printVerse1();
    printVerse2();
    String verse3 = "This one has a little star.";
    printVerse(verse3); // will be called upon by PrintVerse 
    printVerse(verse4); // will be called upon by PrintVerse 
  }//end main
  
  /** declares a String variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish.\n"; //verse1 string which will be printed when called
    System.out.println(verse1);
  }//end printVerse1
  
  /** declares a String variable called verse2 and displays it on the screen*/
  public static void printVerse2(){
    String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish.\n"; // verse2 string which will be printed when called
    System.out.println(verse2);
  } //end printVerse2
  
  /** Accepts a string parameter and displays it on the screen*/
  public static void printVerse(String verse){ 
    System.out.println(verse + "\n");
  }//end printVerse
}//end class
