/** SongApp application
  * COMP160 LAB11
  * Cameron M
  * August 2016
  */
public class SongApp {
/** Begins method that creates new instances of Song and calls Song.java through 'process' and 'getSongLine'
  * @param creates new instances of and calls "Song" */
  public static void main(String[] args) {
  
  // new instances of song
  Song song1 = new Song("While my guitar gently weeps");
  System.out.println(song1.getSongLine()); // prints out the string assigned above
  song1.process();  // calls "process" from Song.java    
  
  Song song2 = new Song("Let it be");
  System.out.println(song2.getSongLine());
  song2.process();  
  
  Song song3 = new Song("Penny Lane");
  System.out.println(song3.getSongLine());
  song3.process();
  
  Song song4 = new Song("");
  song4.process();                   


}//end method
  
}//end class
