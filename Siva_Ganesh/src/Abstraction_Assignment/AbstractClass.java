package Abstraction_Assignment;
/*An abstract class has a construtor which prints "This is constructor of abstract class",
 an abstract method named 'a_method' and a non-abstract method which prints "This is a normal 
 method of abstract class". A class 'SubClass' inherits the abstract class and has a method
  named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass'
   and call the abstract method and the non-abstract method. (Analyse the result)
________________________________________
 */
abstract public class AbstractClass {
  abstract public void  a_method();
  public void show(){
    System.out.println("This is a normal method of abstract class");
  }
  AbstractClass(){
    System.out.println("This is constructor of abstract class");
    
    
  }
}
class SubClass extends AbstractClass{
  public void a_method(){
    System.out.println("This is abstract method");
  }
  public static void main(String[] args) {
    SubClass s1=new SubClass();
    s1.a_method();
    s1.show();
  }
}
