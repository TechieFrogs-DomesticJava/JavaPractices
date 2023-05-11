package Inheritance_Assignment;
/* Class B extends Class A. Class A has two member variables 'i' and 'j', a constructor 
and a method show() which displays the value of i and j.
Class B has a member variable 'k', a constructor. Write a method show() in class B
 which overrides the show() method of class A and displays the value of k.
*/ 
public class ClassA {
  int i=10,j=20;
  
  public void show(){
    System.out.println("value of i &j are: "+i+" "+j);
  }
}
class ClassB extends ClassA{
  int k=20;
    public  void show(){
      System.out.println("value of k is : "+k);
    }
  }

class Test{
  public static void main(String[] args) {
    ClassB b1=new ClassB();
    b1.show();
  }
}