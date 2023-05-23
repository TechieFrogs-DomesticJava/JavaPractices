package Oops;

import Oops.Exerciseinterfaces.InnerClass.InnerSubclass;

public class Exerciseinterfaces {

  static class InnerClass{
  
    interface InnerInterface{
      void show();
    }
      static class InnerSubclass implements InnerInterface{
        int i=10;
        static void display(){
          System.out.println("In static display method");
        }
        @Override
        public void show() {
          System.out.println("In the Implemented Show method");
        }
      }
    }
    public static void main(String[] args) {
      Exerciseinterfaces.InnerClass.InnerSubclass Obj1=new Exerciseinterfaces.InnerClass.InnerSubclass();
      Obj1.show();
      System.out.println(Obj1.i);
      
      InnerSubclass.display();

    }

}


