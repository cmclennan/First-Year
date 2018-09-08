public class Udemy {

public static void main(String args[]){
  String [] family = {"Cameron", "Hayden", "Helen", "Neil"};

  for(String x : family){
    System.out.print( x + "\n" );

  }
  
  for(String x : family){
    System.out.print( x + " " );

  }
  System.out.println("|| Family list is " + family.length + " members long.");
  System.out.println(family.length);
}
}