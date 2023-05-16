package Oops;

import Interface_practice.InterfaceExp07;

/*Create an interface with at least one method, in its own package. Create a class
 in a separate package. Add a protected inner class that implements the interface. 
 In a third package, inherit from your class and, inside a method, return an object
  of the protected inner class, upcasting to the interface during the return. */
public class NewExp107 {
  
    protected class InnerClass108 implements InterfaceExp07 {
      public void show1() {
        System.out.println("In the New Exp107 class: ");
      }
      public InnerClass108(){

      }
    }
  }

  

  

