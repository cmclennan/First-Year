/** Lab 16 COMP160
  * Cameron M
  * September 2016
  */

public class MultiplicationGrid {
  /** main loop for an array to produce a 12x12 multiplication grid, displays and prints out below
    * @param initialises 12x12 multiplication grid and prints it out */
  public static void main (String [] args) {
    int[][] table = new int[12][12];// initialises a 2d array with two values
    for (int row = 0; row < 12; row++){//paramaters for row
      for (int col = 0; col < 12; col++){ // parameters for column
        table[row][col] = (row + 1) * (col + 1);// adds one to row and column to multiply
      }
    }
    for (int x [] : table) {// nested for each loop
      for (int y : x) { 
        System.out.print(y + "\t");// prints out each multiplication set and sets space of tab between them
      }
      System.out.println();// prints a new line
    }
  }// end method
}// end class
