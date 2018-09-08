public class Classroom {
  private int seats;
  private double area;
  private String name;
  
  public Classroom( double areaIn) {
  }
  
  public Classroom() {
  }
  
  public void setArea(double areaIn) {
  }
  
  public double getArea() {
    return area;
  }
  
}

----------;


// 25 - classroom main
public class ClassroomApp{
public static void main(String [] args){
  Classroom c1 = new Classroom();
  c1.setArea(35.56);
  Classroom c2 = new Classroom(50);
  
  c1.toString();
  c2.toString();
}
}