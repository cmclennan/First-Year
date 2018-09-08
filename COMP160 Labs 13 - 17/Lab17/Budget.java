//26 - budget support
public class Budget {
  private double rent2Week;
  private double food1Week;
  private double power4Week;

  
  
  public Budget(double rent2Week, double food1Week, double power4Week){
    this.rent2Week = rent2Week;
    this.food1Week = food1Week;
    this.power4Week = power4Week;
  }
  
  public  double getWeeklyBudget(){
    double weekly = (((rent2Week*2) +(food1Week *4) + (power4Week*1))/4);
    return weekly;
  }
  
  public double getPeriodExpenses( int weeks){
    double periodPrice = weeks * getWeeklyBudget();
    return periodPrice;
  }
  
  public String toString(){
    String desc = "Rent is paid every two weeks, power every 4, and food is weekly.";
    return desc;
  }
  
}
  
  