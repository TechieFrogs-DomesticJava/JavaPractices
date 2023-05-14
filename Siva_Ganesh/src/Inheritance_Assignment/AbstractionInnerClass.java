package Inheritance_Assignment;

abstract public class AbstractionInnerClass {
  int a=10;
  int k=30;
  String name="Siva";
  abstract public int show();
  abstract public String display();
  public void show1(){
    System.out.println("In the Show one Method");

  }
  public static void main(String[] args) {
    AbstractionInnerClass a1object= new AbstractionInnerClass() {
      
      
      @Override
      public int show() {
        // TODO Auto-generated method stub
        System.out.println("In the Show implemented Abstract method");
        implement();
        return 0;
      }

      @Override
      public String display() {
        
        System.out.println("In the display ");
        return "null";
        
      }
      public void implement(){
        System.out.println("in the implemented method: "+a+" "+k+" "+name);
      }
    };
    a1object.display();
    a1object.show();
    a1object.show1();
  }
}
