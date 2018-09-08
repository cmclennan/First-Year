/** COMP160
  * Cameron M
  * 4.8.16
  * Support class for Box App
  * */

/** Start of Class */

public class Box {
  
  
  
  
  /** creates private variables for height, length and width */
  private int height;
  private int width;
  private int length;
  
  /** Simplified constructor for output required in step 12 */
  public Box (int h, int l, int w){
    height = h;
    length = l;
    width = w;
  }// end method
  
  
  /** Creates a box and sets defaults to 0 */
  public Box(){}
  
  
  /** sets sides for the box */
  public Box(int side){
    height = side;
    width = side;
    length = side;

  }// end method
 
  
  /** sets the value of the data field height to input parameter value
    *@param h height of object */
  public void setHeight(int h) {
    height = h;
  } // end method
  
  
  /** sets the value of the data field width to input parameter value
    *@param w width of object */
  public void setWidth(int w) {
    width = w;
  } // end method
  
  
  /** sets the value of the data field length to input parameter value
    *@param l length of object */
  public void setLength(int l) {
    length = l;
  } // end method
  
  
  /**returns the value of the data field height
   *@ return the height of the object */
  public int getHeight() {
    return height;
  } // end method
  
  
  /**returns the value of the data field length
   *@ return the length of the object */ 
  public int getLength() {
    return length;
  } // end method
  
  
  /**returns the value of the data field width
   *@ return the width of the object */  
  public int getWidth() {
    return width;
  } // end method
      
       
  /**returns the value of the data field height
   *@ return the surface area of the object */
  public int getSurfaceArea() {
    return 2 * ( (length * height) + (width * height) + (length * width) ); 
  } // end method
  
  public int getVolume() {
    return length * width * height;
    
  } // end method

  
  
  /** output string to display results in the interactions tab below, filled in with variables entered in the box app */
  public String toString() {
    return( "Height is: " + getHeight() + ", " + "Length is: " + getLength() + ", " + "Width is: " + getWidth() + ", " 
                         + "Volume is: " + getVolume() + ", " + "Surface Area is: " + getSurfaceArea() );
  }// end method
} // end class


  
      
      
      
      