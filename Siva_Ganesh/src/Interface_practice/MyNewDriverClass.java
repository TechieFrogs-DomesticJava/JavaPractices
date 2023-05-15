package Interface_practice;
public class MyNewDriverClass implements MyFirstInterface1{


  public static void main(String[] args) {
    MyNewDriverClass D1=new MyNewDriverClass();
    D1.in_method();
    D1.show();
    D1.display();
   
   // MyFirstInterface.static_method();
  }

  @Override
  public void in_method() {
    // TODO Auto-generated method stub
    MyFirstInterface1.super.in_method();
  }

  @Override
  public void display() {
    
    System.out.println("In the display Method");
  }

  @Override
  public void show() {
    
  System.out.println("In the Show Method");
  }
}
