package Oops;

import Oops.NestedClassDemo.InnerClassDemo;

public class NestedClassDemo {
    int i=20;
    String name="Ramu";
    void display(){
      System.out.println("in the Outer class Method :");
    }
    NestedClassDemo(){
      System.out.println("In the Nested Outer class Constructor ");
    }
    void testInstance(){
      System.out.println("Test Instance Method");
      InnerClassDemo nObj=new InnerClassDemo();
      nObj.in_innerClassDisplay();
    }
    class InnerClassDemo {
        int k=30;
        
        void in_innerClassDisplay(){
            i=10;
            name="siva";
            display();
          
          System.out.println("in_innerClassDisplay Method ");
        }
        InnerClassDemo(){
          System.out.println("In the InnerClassDemo Constructor");
        }
        
  }
}
class Main{

public static void main(String[] args) {
  NestedClassDemo n1=new NestedClassDemo();
  InnerClassDemo n2Obj=n1.new InnerClassDemo();
  n1.display();
  n2Obj.in_innerClassDisplay();
  n1.testInstance();
}
}
