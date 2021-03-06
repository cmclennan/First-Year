/** support class for CruiseApp.java
 * Lab 9 COMP160
 * Cameron M
 * August 2016
 */

/** beginning of Customer class 
  * @param starts the Customer support class */
public class Customer {
 private String name; //private name string
 private boolean child; // private bool child value
 private boolean student; // private bool student value
 private boolean booked = false; // private bool booked value, deafult = false

/** creates a method assigning variables making it easier in the application class
  * @param assigning variables to Customer */
 public Customer (String nameIn,int age, boolean studentIn) {
  name = nameIn;
  child = (age >= 5 && age <= 16);
   

    student = studentIn;
  }// end method

  /** gets name
  * @returns name */
  public String getName(){
  return name;
 }// end method
 
  /** bool value for is child
  * @returns if they are a child or not */
  public boolean isChild(){
  return child;
 }// end method

   /** bool value for is student
  * @returns if they are a student or not */
  public boolean isStudent(){
    return student;
 }// end method

  /** bool value for is booked
  * @returns if they are a booked or not */
    public boolean isBooked(){
      return booked;
  }// end method
 
  /** bool value for setting booked 
  * @returns booked being true */
  public void setBooked(){
    booked = true;
  }// end method

}// end class
