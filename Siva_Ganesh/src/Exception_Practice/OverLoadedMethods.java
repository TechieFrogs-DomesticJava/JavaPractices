package Exception_Practice;
import java.io.*; 
public class OverLoadedMethods {
     
 
  
  // defining the method   
  void msg() {  
    System.out.println("parent method");  
    }    
}    
    
 class TestExceptionChild extends OverLoadedMethods{    
  
  // overriding the method in child class  
  // gives compile time error  
  void msg() throws ArithmeticException  {    
    System.out.println("TestExceptionChild");    
  }  
  
  public static void main(String args[]) {    
   OverLoadedMethods p = new TestExceptionChild();    
   p.msg();    
  }    
}    

