public class StaticVariable {
   static int a1=15;
  int b1=13;
  public static void main(String[] args) {
    System.out.println(a1);
    
    StaticVariable.a1=14;
    System.out.println(a1);
    System.out.println(a1);
    
  }
  
}
