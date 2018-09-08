  public class C extends B {
    private int x;
    private String a;
    
    public C (int x, String a, String s){
      super(s);
      this.x = x;
      this.a = a;
    
      s = "Five";
      System.out.println("C: x is " + x);
      System.out.println("C: a is " + a);
      System.out.println("B: s is " + s);
      System.out.println("B: s is " + getS());
      System.out.println("C: s is " + s);
    }
  }