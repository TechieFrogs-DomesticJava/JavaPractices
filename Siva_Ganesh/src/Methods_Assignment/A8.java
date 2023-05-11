package Methods_Assignment;
/*Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method
 with the same name to print "Child". Now call this method by the objects of the two classes. Also, call
  this method by an object of the parent class refering to the child class i.e. A obj = new B() */
class A{
  static void display(){
    System.out.println("Parent");
  }
}
class B extends A{
  static void display(){
    System.out.println("Child");
  }
}
public class A8 {
  public static void main(String[] args) {
    //A obj = new B();
    A.display();
    B.display();
    //obj.display();
  }
}
