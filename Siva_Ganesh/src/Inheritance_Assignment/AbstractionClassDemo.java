package Inheritance_Assignment;

abstract class AbstractionClassDemo extends AbstractionParentClassDemo{
  abstract void RectangleArea();
  abstract void SquareArea();
  AbstractionClassDemo(){
    System.out.println("In AbstractionClassDemo Constructor ");
  }
  public static void main(String[] args) {
    AbstractionChildClassDemo a1=new AbstractionChildClassDemo();
    System.out.println("Show method :->"+a1.show());
    System.out.println("In display Method :->"+a1.display());
  }

}
