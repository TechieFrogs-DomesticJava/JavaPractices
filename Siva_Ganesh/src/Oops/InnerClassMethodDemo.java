package Oops;

public class InnerClassMethodDemo {
  int i=30;
  String name="techie";
  static void in_method(){
    int i1=40;
    String name1="siva";
    System.out.println("Int value :"+i1+" "+"Name is :"+name1);
  }
   void display(){
    class InnerMethodClass{
      int a=20;
      void method_display(){
        System.out.println("In the Method Demo");
        System.out.println("int value :"+a+" name :"+name);
      }
      
    }
    InnerMethodClass Mobj1=new InnerMethodClass();
      Mobj1.method_display();
  }
}
class Main1{
  public static void main(String[] args) {
    InnerClassMethodDemo obj=new InnerClassMethodDemo();
    obj.display();
    InnerClassMethodDemo.in_method();
    
  }
}
