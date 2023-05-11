package Oops;

public class DefaultDemo1 extends ParentClass{
  int i=10;
  public int k=20;
  protected String name="Kiran";
  public static void main(String[] args) {
    DefaultDemo1 d1=new DefaultDemo1();
    System.out.println(d1.i);
    System.out.println("In Parent Final Static value"+ParentClass.a);
  }
}
