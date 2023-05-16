package Interface_practice;
/*Create an interface with at least one method, and implement that interface
 by defining an inner class within a method, which returns a reference to your interface. */
public interface NewExp08 {
  void in_method();

public static void main(String[] args) {
  

NewExp08 obj1=new NewExp08() {
  public void in_method(){
    System.out.println("Inner class method");
  }
};
obj1.in_method();
}
}