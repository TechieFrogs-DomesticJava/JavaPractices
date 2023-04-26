public class Hello1 {
  static int data=1;
  final int strict;
  {
    strict=10;
   
  }
  public static void main(String[] args) {
    System.out.println("This is the first program");
    Hello1 c1=new Hello1();
    Hello1.data=2;
    System.out.println(Hello1.data);
    c1.display();
    System.out.println(data);
    char ch=65;               //ASCII Value
    System.out.println(ch);
    char ch1=200;
    System.out.println(ch1);
  }
    void display(){
      System.out.println("This is local scope");
      int a,b,c;
      a=10;b=20;
      c=a+b;
      System.out.println(c);


    
  }
    
}
