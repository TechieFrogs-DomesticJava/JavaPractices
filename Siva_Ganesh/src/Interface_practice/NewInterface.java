package Interface_practice;
public interface NewInterface {
  int i=30;
  public void display();
  void show();
  default void in_method(){
    System.out.println("In the in_method");
  }
  static void static_method(){
    System.out.println("In the Static_method");
  }
  private void private_name() {
    System.out.println("In the private method");
  }
  public static void main(String[] args) {
    
  
  NewInterface nObj=new NewInterface() {

    @Override
    public void display() {
      System.out.println("In display Method");
    }

    @Override
    public void show() {
      System.out.println("In tthe Show Method");
    }
    
  };
  nObj.in_method();
  nObj.show();
  nObj.display();
  nObj.private_name();
  }
}
