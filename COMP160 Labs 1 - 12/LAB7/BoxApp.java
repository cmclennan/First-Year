/** COMP160
  * Cameron M
  * 4.8.16
  * App class for Box App
  * */

/** Start of Class */
public class BoxApp {
  
  public static void main(String[]args) {
/** boxes decleared below in various call methods */    
    Box box1 = new Box();
    box1.setHeight(4);
    box1.setLength(4);
    box1.setWidth(6);
    System.out.println(box1);
/** part 12 call method */   
    Box box2 = new Box( 3, 4, 5);
    System.out.println(box2);
/** part 16 call method */  
    Box box3 = new Box(5);
    System.out.println(box3);
    
  }//end method
  

  
}// end class