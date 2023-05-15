package Interface_practice;
public interface MyFirstInterface1 {
  int i=30;
  public void display();
  void show();
  default void in_method(){
    System.out.println("In the in_method");
  }
  static void static_method(){
    System.out.println("In the Static_method");
  }
}
