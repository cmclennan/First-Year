/** Lab 15 COMP160
  * Cameron M
  * September 2016
  */

public class IntCounter {
  private int[] numArray;
  

  /** accessor method for private array named numArray
    * @param accesses private array named numArray */
  public IntCounter(int [] x){
    this.numArray = x;    

  }// end method
  
  
  /** cearches through array to find desired number
    * @param searches array for desired number, adds to count variable if it finds it 
    * and related output is returned when loop finishes */
  public void showTarget(int target){
    int count = 0;
    for (int x : numArray){
     System.out.print( x + " ");
    } System.out.println("Array length is: " + numArray.length);
    for (int base = 0; base < numArray.length; base+=1){
      if(numArray[base] == target){
        System.out.println("\t" + "There is a number " + target + " at position " + base + " in the array");
        count++;
      }
    }
    if (count == 0) {
      System.out.println("\t" + "there is no number " + target + " in the array" + "\n" + "\n");
    }
    }// end method
  }// end class

    