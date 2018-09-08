/** 
Cameron M, August, 2016
*/

public class BookShopApp {// begins class
  
  public static void main(String[]args){
    Book b1 = new Book(); // creates a new book
    b1.setTitle("Life of Pi"); // sets book title
    b1.setPrice(28.90); // sets book price
    b1.setPages(348); // sets book page count
    b1.displayBook(); // calls for the book to be displayed

    Book b2 = new Book(); // creates a new book
    b2.setTitle("Mister Pip"); // sets book title
    b2.setPrice(22.70); // sets book price
    b2.setPages(240); // sets book page count
    b2.displayBook(); // calls for the book to be displayed
    
    Book b3 = new Book(); // creates a new book
    b3.setTitle("Java Foundations"); // sets book title
    b3.setPrice(94.50); // sets book price
    b3.setPages(1074); // sets book page count
    b3.displayBook(); // calls for the book to be displayed
    
  }// ends books
}// ends class
    