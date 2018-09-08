//30 - finds letter I
public class Ifinder {

public static void main(String[]args) {
  int count = 0;
  int pos = 0;
  char c = 'i';
  String s = "this is a test";
  
  
  while(pos < s.length()){
    String lowerCase = s.toLowerCase();
    if(lowerCase.charAt(pos) == c){
      count++;
      pos++;
    } else {
      pos++; 
  }
}
   System.out.println(c + " has appeared " + count + " times");
}
}

