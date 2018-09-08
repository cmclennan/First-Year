//23 - canPay method
public class Customer {
 
  private boolean hasMoney;
  private boolean hasCredit;
  
  public boolean canPay(){
    if (hasMoney || hasCredit)
      return true;
  } else {
    return false;
  }
}
  
 



  