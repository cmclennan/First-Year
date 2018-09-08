/** Lab 15 COMP160
  * Cameron M
  * September 2016
  */
import java.util.Random; // imports random
import java.util.Scanner; // imports scanner

public class IntCounterApp {
  
    /** creates the user input reader method
      * @param creates user input reader method to be called */
    public static int readInput(String number){
    Scanner scan = new Scanner(System.in);
    System.out.println(number);
    return scan.nextInt();
  }// end method
    /** creates a new array between 5 to 10 digits long, with a max number in the array being 4
      * @param creates new array with length bwtween 5 - 10 digits, max number in array <= 4 */
    public static int[] makeArray(){
      Random rand = new Random();
      int arrayLen = rand.nextInt(5) + 5 ;
      int [] array = new int[arrayLen];
      for(int x = 0; x < arrayLen; x +=1){
        array[x] = rand.nextInt(5);
      }
      return array;
    }// end method
    
   /** calls scanner method, calls array creation method, displays array and what the user is inputting to find
     * @param gets user input values by calling readInput method, create array method is called and then is searched throug
     * for desired number */
   public static void main(String [] args){
    for (int x = 0; x < 3; x++){
      int input = readInput("\n" + "Which number between 1 and 4 do you wish to find?" + "\n");
      System.out.println("number to find: " + "[" +input+"]");
      //int[] array1 = makeArray();
      IntCounter newAr = new IntCounter(makeArray());
      newAr.showTarget(input);
    }
      System.out.println("Finished");
  }// end method
}// end class

      