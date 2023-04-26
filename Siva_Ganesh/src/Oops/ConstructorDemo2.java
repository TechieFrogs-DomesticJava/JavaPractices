package Oops;

public class ConstructorDemo2 {
  int i;
  String str;
  ConstructorDemo2(){
    i=25;
    str="Hello";
    System.out.println("In side Constructor");
  }

  public static void main(String[] args) {
    ConstructorDemo2 cd2=new ConstructorDemo2();
    System.out.println("i value is : "+cd2.i);
    System.out.println("String value is : "+cd2.str);
  }
}
