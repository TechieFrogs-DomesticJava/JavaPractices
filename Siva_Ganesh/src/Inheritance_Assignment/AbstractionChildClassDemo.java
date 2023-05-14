package Inheritance_Assignment;

public class AbstractionChildClassDemo extends AbstractionClassDemo{
  
  public static void main(String[] args) {
    AbstractionChildClassDemo a1=new AbstractionChildClassDemo();
    a1.RectangleArea();
    a1.SquareArea();
  }

  @Override
  void RectangleArea() {
   
    int l=10,b=20;
    int result =l*b;
    System.out.println("Rectangle area is : "+result);
    
  }

  @Override
  void SquareArea() {
    int a=10;
    int result=a*a;
    System.out.println("Rectangle area is : "+result);

  }

  @Override
  public int show() {
    return 10;
  }

  @Override
  public String display() {
    return "Techie Frogs";
  }
}
