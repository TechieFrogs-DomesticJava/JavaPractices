package Oops;

public class SubClass extends ParentClassDemo1{
  int i=10;
  String name="siva";
  SubClass(){
    System.out.println("In Subclass constructor");
  }
  public void display(){
    super.display();
    System.out.println("In Subclass Method Instance variables are"+" \n"+"i="+super.i+" "+"name="+super.name);
    System.out.println("In Subclass Method Local variables are"+" \n"+"i="+this.i+" "+"name="+this.name);
  }
  public static void main(String[] args) {
    SubClass s1=new SubClass();
    s1.display();
    
  }
}
