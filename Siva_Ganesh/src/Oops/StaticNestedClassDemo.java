package Oops;

import Oops.InnerClassExample.InnerInterfaceExample2;

public class StaticNestedClassDemo implements InnerInterfaceExample2{
  interface inner{
    int a=50;
    void in_interfaceMethod();
  }
  static class InnerStaticClass{
    private int InnerStaticClass_A=20;
    static void staticMethod1(){
      System.out.println("In the Static Method :");
    }
    void display(){
      
      System.out.println("In Non static method: "+InnerStaticClass_A);
    }
    class DeeperClass{

    }
    static interface newOne{
      
    }
    
  }
  int a=10;
  String value="str";
  

public static void main(String[] args) {
  StaticNestedClassDemo obj2=new StaticNestedClassDemo();
  InnerStaticClass obj=new InnerStaticClass();
  StaticNestedClassDemo.InnerStaticClass.staticMethod1();
  obj.display();
  
}


@Override
public void display() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'display'");
}


@Override
public void show() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'show'");
}
}
