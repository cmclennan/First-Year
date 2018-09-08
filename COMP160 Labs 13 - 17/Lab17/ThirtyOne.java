//31 - corrects and prints loop

public class ThirtyOne {
  
  public static void main(String [] args) {
    int limit = 20;
    int number = 10;
    
    while(number < limit) {
      System.out.print( number + ":");
      if(number % 2 == 0) {
        System.out.print( " even");
      } if (number % 3 == 0 ){
        System.out.print( " three");
      } 
      System.out.println();
      number++;
    }
  }
}

 