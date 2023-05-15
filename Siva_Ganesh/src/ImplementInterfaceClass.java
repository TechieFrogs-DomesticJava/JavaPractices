public class ImplementInterfaceClass implements MySecondInterface{

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("In the Display Method");
  }

  //@Override
  //public void show() {
    // TODO Auto-generated method stub
  //System.out.println("In the Show Method");
 // }
  public static void main(String[] args) {
    ImplementInterfaceClass ImpObject1=new ImplementInterfaceClass();
    ImpObject1.display();
   // ImpObject1.show();
    System.out.println( " MySecondInterface i value is"+MySecondInterface.i+"  "+MySecondInterface.k);
  }
  
}
