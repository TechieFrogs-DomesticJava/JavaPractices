package Oops;

public class ConstructorDemo1 {
  ConstructorDemo1(){
    this(2,4);
    System.out.println("From Constructor Demo1 In Constructor ");
  }
  ConstructorDemo1(int a,int b){
    this(2.0f,"siva");
    System.out.println("values are :"+a+" "+b);
  }
  ConstructorDemo1(float a,String b){
    System.out.println("values are :"+a+" "+b);
  }
  public static void main(String[] args) {
    ConstructorDemo1 v1=new ConstructorDemo1();
    //ConstructorDemo1 v2=new ConstructorDemo1(10,20);
  }
}
