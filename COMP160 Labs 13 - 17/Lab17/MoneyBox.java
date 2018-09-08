// 29 - money box
public class MoneyBox{
  private double balance;
  
  public MoneyBox(double initial){
  }
  
  
  public double getBalance(){
    return balance;
  }
  
  public void incoming(double donation) {
    balance += donation;
  }
}
  
