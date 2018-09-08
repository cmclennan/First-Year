import java.util.Scanner;

public class Test {
//  public static void main (String [] args) {
//  System.out.println("Enter an integer");
//  Scanner scan = new Scanner(System.in);
//  int newInt = scan.nextInt();
//  }
  
  public static void main (String [] args){
  public static int readInt() {
    boolean success;
    int input = 0;
    do {
      success = true;
      System.out.println("Please enter an integer: ");
      try {
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
      } catch (java.util.InputMismatchException e) {
        System.out.println("Unexpected input, please try again.");
        success = false;
      }
    }while (!success);
    return input;
  }

  