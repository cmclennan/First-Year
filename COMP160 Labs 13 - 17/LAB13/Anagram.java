/** Lab 13 COMP160
  * Cameron M
  * September 2016
  * Takes two inputs and compares them to see if they are anagrams of each other
  */


import java.util.Scanner;

public class Anagram {
  
  /** Creates main loop where user input is stored after it is intially entered and calls anagramCheck method
    * @param takes and stores user input, calls anagramCheck method */
 
  public static void main(String[]args) {
     String phraseOne = userInput("Enter phrase 1 ");
     String phraseTwo = userInput("Enter phrase 2 ");
     
     anagramCheck(phraseOne, phraseTwo);
     
  }// end method
  
  
  /** creates anagram checker loop which iterates through strings and shuffles letters into alphabetical order and stores them
    * @param takes stored values entered by user and stores them in a new variable in alphabetical order and compares the two. What is output is 
    * dependant upon whether or not two phrases are anagrams */
  public static void anagramCheck(String firstPhrase, String secondPhrase){
    String phraseOneLower = firstPhrase.toLowerCase();
    String phraseTwoLower = secondPhrase.toLowerCase();
    String tempOne = " ";
    String tempTwo = " ";
    
    for (char c = 'a'; c <= 'z'; c++) {
      for(int a = 0; a < phraseOneLower.length(); a++){
        if (c == phraseOneLower.charAt(a))
          tempOne = tempOne + c;
      }
       for(int a = 0; a < phraseTwoLower.length(); a++){
         if (c == phraseTwoLower.charAt(a))
          tempTwo = tempTwo + c;
       }
    }
    
    
    System.out.println(tempOne + " are the letters of " + firstPhrase + " in order.");
    System.out.println(tempTwo  + " are the letters of " + secondPhrase + " in order.");
    
   // compares two stored variables, letter order being alphabetically correct
    if (tempOne.equals(tempTwo)){
      System.out.println(firstPhrase + " is an anagram of " + secondPhrase);
    } else {
      System.out.println(firstPhrase + " is not an anagram of " + secondPhrase);
    }
  }// end method
    
    /** Creates a scanner to be called upon by main
      * @param scanner for main to call */
    public static String userInput(String input){
      Scanner scan = new Scanner(System.in);
      System.out.println(input);
      return scan.nextLine();
    }// end method   
  }// end class

        
        
       
       
      
    
    
       
    

    
    
    
    
  