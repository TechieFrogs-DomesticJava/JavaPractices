package Inheritance_Assignment;
/*Create a class with a method that prints "This is parent class" and its subclass with another method
 that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
 */
public class ParentClass {
  public void Display(){
    System.out.println("This is Parent Class");
  }
}
class Subclass extends ParentClass{
  public void Display(){
    super.Display();
    System.out.println("This is Child Class");
  }
}
class Exp{
  public static void main(String[] args) {
    ParentClass p1=new ParentClass();
    Subclass s1=new Subclass();
    p1.Display();
    s1.Display();
  }
}
