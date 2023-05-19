package Oops;

import Oops.InnerClassExample.InnersubClassExample;


public class InnerClassExample {
  
   int InnerClassExample_value=50;
  static String innerClassExample_String="Techie Frogs";

  static class InnersubClassExample{
      int InnersubClassExample_B=250;
      final static String innersubClassString=" Staffing";
       static void display(){
        System.out.println("innersubClassString : "+innersubClassString);
      } 
  }
   class InnerClass2Example2 {
    

    


    
    public void display() {
      System.out.println("In inner Class2 Example");
    }

   
    public void show() {
      System.out.println("In inner subclass2 show method");
    }

  }
}

class Main2{
  public static void main(String[] args) {
    InnerClassExample obj1=new InnerClassExample();
   
    InnerClassExample.InnersubClassExample Obj2=new InnerClassExample.InnersubClassExample();
    System.out.println(Obj2.InnersubClassExample_B);
    
    InnerClassExample.InnerClass2Example2 obj3=obj1.new InnerClass2Example2();
    InnersubClassExample.display();
    obj3.display();
    obj3.show();
    
  }
}


