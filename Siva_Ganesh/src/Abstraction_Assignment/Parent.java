package Abstraction_Assignment;
/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses 
each having a method with the same name 'message' that prints "This is first subclass" and
 "This is second subclass" respectively. Call the methods 'message' by creating an object
  for each subclass. */
abstract public class Parent {
  abstract public void message();
}
class Subclass1 extends Parent{

  @Override
  public void message() {
    System.out.println("This is first subclass");
  }
  
}
class Subclass2 extends Parent{

  @Override
  public void message() {
    System.out.println("This is Second subclass");
  }
  public static void main(String[] args) {
    Subclass1 s1=new Subclass1();
    Subclass2 s2=new Subclass2();
    s1.message();
    s2.message();
  }
}
