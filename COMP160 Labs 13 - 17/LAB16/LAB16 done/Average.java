/** Lab 16 COMP160
  * Cameron M
  * September 2016
  */

public class Average{
  /** main loop which intialises and fills 2d array, figures out average of each part of
    * the array and stores it for printing
    * @param initialises and fills 2d array, figures out average of each part of array and stores it */
  public static void main(String [] args){
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};// 2d array initialisation
    for (int i = 0; i < table.length; i++) {// parameters for iterating through array
      double sum = 0; // stores sum as a double for increased accuracy
      for (int x = 0; x < table[i].length; x++) { // parameters for iterating through array
        sum += table[i][x]; // adds values in corrosponding spot in to sum 
        System.out.print(table[i][x] +"  ");// prints out table
      }
      System.out.println(" Average : " + sum/table[i].length);// prints out the selected part of array and displays its average
    }// end method   
  }  
}// end class

 