package Oops;

public class MethodDemo {
  
    int sum(int a,int b){
      int c=a+b;
      return c;
    }
    public static int multiply(int a,int b){
      int c=a*b;
      return c;
    }
  public static void main(String[] args) {
    MethodDemo m1=new MethodDemo();
    multiply(4,9);
    System.out.println("Addition of two numbers are : "+m1.sum(4,5));
  }
}
