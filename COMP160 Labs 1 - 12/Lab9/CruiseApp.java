/** application class for Customer.java
 * Lab 9 COMP160
 * Cameron M
 * August 2016
 */


/** imports Decimal formatting and input scanner
  * @param user input scanner and decimal format imported */
import java.text.DecimalFormat;
import java.util.Scanner;

/** Beginning of Cruiser application
  * @param creates application class */
public class CruiseApp{
    
    public static void main(String[]args){
        //each Customer created with name, age, showed student ID card
        Customer customer1 = new Customer("Aaron Stott",17, true);
        Customer customer2 = new Customer("Betty Adams",17, false);
        Customer customer3 = new Customer("Corin Child",16, true);
        Customer customer4 = new Customer("Doris Stewart",25, true);
        Customer customer5 = new Customer("Edmond Cheyne",12, false);
        Customer customer6 = new Customer("Fiona Chaney",7, false);
        Customer customer7 = new Customer("Ged Still-Child",16, true);
        Customer customer8 = new Customer("Harry Adamson",20, false);
        confirmBooking(customer1); 
        confirmBooking(customer2);
        confirmBooking(customer3); 
        confirmBooking(customer4);
        confirmBooking(customer5); 
        confirmBooking(customer6);
        confirmBooking(customer7); 
        confirmBooking(customer8);
        
        displayBooking(customer1);
        displayBooking(customer2);
        displayBooking(customer3);
        displayBooking(customer4);
        displayBooking(customer5);
        displayBooking(customer6);
        displayBooking(customer7);
        displayBooking(customer8);
        
    }// end method

    /** creates ticket cost, meal cost, and deals with age multipliers
    * ticket cost, meal cost and age multipliers */
    public static void confirmBooking(Customer customer) {
        final double TICKET = 56.0;
        final double MEAL = 30.0;
        double ticket;
        double meal;

        if (customer.isChild()){ // child child price calculator
            meal = MEAL * 0.5;
            ticket = TICKET * 0.5;
        } else if (customer.isStudent()) { // student price calculator
            meal = MEAL * 0.9;
            ticket = TICKET * 0.5;
        } else { // all other ages price calculator
            meal = MEAL * 0.9;
            ticket = TICKET * 0.8;
        }// end method

        /** sets decimal formatting to 2dp 
        * @param 2dp config for outputs */
        DecimalFormat df = new DecimalFormat("0.00"); 
        /** prints out users names with prices corrected for their discount qualification
         * @param user name, price printed out with decimal formatting */
        System.out.println("Customer Name: " + customer.getName() + " \nTicket price: " + df.format(ticket) +
                           " \nMeal price: " + df.format(meal) + " \nTotal Price: " + df.format(ticket + meal));
        /** allows user input to confirm booking for each customer
          * @param user input confirming booking for customer */
        System.out.println("\nBooking confirmation for: " + customer.getName() + ". \nIs the customer booked?" + " Y/N");
        Scanner sc = new Scanner(System.in);
        String booking = sc.nextLine();
        if (( booking.equals("y")) || (booking.equals("Y"))){
          customer.setBooked();
          System.out.println("Customer is Booked\n");
        } else {
          System.out.println("Customer is not Booked\n");
        }// end method
        
        
    }// end method
    
    public static void displayBooking(Customer customer) {
      if (customer.isBooked()){
        System.out.println(customer.getName() + "is booked");
      } else {
        System.out.println(customer.getName() + "is not booked");
      }

    }
}// end class
        
    
    

    
    
