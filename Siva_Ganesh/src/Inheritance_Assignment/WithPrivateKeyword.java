package Inheritance_Assignment;
 
class Subclass extends WithPrivateKeyword{
  public void Display(){
   // super.Display();
    System.out.println("This is Child Class");
  }
}
public class WithPrivateKeyword {
  private void Display(){
    System.out.println("This is Parent Class");
  }
  public static void main(String[] args) {
    
  
    WithPrivateKeyword w1=new WithPrivateKeyword();
      Subclass s1=new Subclass();
      w1.Display();
      s1.Display();
  }
}
