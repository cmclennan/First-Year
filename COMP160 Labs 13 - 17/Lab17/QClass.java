
public class QClass {
  private int number;

  public QClass( int num) {
  }
  
  public QClass() {
  }
  
  public void setNumber(int num) {
  }
  
  public void display() {
  }
  
  public static void main(String [] args){
    QClass q1 = new QClass();
    q1.setNumber(100);
    QClass q2 = new QClass(500);
    
    q1.display();
    q2.display();
}
}