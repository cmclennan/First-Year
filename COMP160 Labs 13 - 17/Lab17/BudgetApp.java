//27 - budget app
public class BudgetApp {
  public static void main(String[] args){
    Budget budget1 = new Budget(200,100,75);
    
    displayBudget(budget1);
    
  }
  
  public static void displayBudget(Budget budget) {
    System.out.println("Cost over desired period: " + budget.getPeriodExpenses(5) + "\n" + budget.toString());
  }

}
  
