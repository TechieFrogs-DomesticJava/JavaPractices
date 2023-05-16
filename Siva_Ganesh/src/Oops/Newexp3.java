package Oops;
/*Create an interface containing three methods, in its own package. Implement the interface in a different package. 
•  Prove that all the methods in an interface are automatically public.
 */
import Interface_practice.NewExp3;

public class Newexp3 implements NewExp3 {

  @Override
  public void show() {
    System.out.println("In the show Method");
  }

  @Override
  public void display() {
    System.out.println("In the Display Method");
  }
  public static void main(String[] args) {
    Newexp3 eObj1=new Newexp3();
    eObj1.display();
    eObj1.show();
  }
}
