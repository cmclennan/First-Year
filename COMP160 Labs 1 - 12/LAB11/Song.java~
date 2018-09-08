/** Support class for SongApp.java
  * COMP160 LAB11
  * Cameron M
  * August 2016
  */


public class Song {
  //stores a private variable called songLine
  private String songLine; 
  
  
  public Song (String sLine){
    songLine = sLine;
  }
  
  public String toString() {
    return songLine;
  }
  
  public String getSongLine(){
    return songLine;
  }
  
  /** Begins method that prints out length of strings in SongApp, splits strings, finds letters and does character replacement
    * @param runs provess legth printer, letter finds, string splitter, and letter replacement */
  public  void process() {
    System.out.println("Length of song line is: " + songLine.length() + " characters");
    
    if (songLine.length() >0){
    System.out.println("Last character of song line is: " + songLine.charAt(songLine.length() - 1));
    } else {
      System.out.println("There is no song line here.");
    }
   
   
    //finds spaces in order to find third word, and if there are are insufficent spaces, another sentence is printed
    if (songLine.indexOf(' ', songLine.indexOf(' ') +1) >0) {
      int index = songLine.indexOf(' ', songLine.indexOf(' ') + 1);
      System.out.println(songLine.substring(0, index) + "\n" + songLine.substring(index +1));
      System.out.println("First letter of third word is: " + songLine.charAt( index +1));
    } else System.out.println("\n---- There are insufficent spaces to produce the desired output ----\n");
    
    // prints an uppercase converted version of songLine
    if (songLine.length() >0){    
    System.out.println("Song line converted into upper case is: " + songLine.toUpperCase());
    } else {
      System.out.println("There is no such thing as an uppercase blank space.");
    }
    
    //finds spaces in sentences and replaces them with 'x'
    for (int a = 0; a < songLine.length(); a++) {
      if (songLine.charAt(a) == ' ') System.out.print('x');
      else System.out.print(songLine.charAt(a));
    } System.out.println();
    //prints out where the letter 'b' is within the string
    System.out.println(songLine.indexOf('b'));
    //prints black spacer lines
    System.out.println("\n");
    
    
        
  }// end method 
  }// end class

