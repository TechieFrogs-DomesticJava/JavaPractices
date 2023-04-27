package Oops;

public class ParamerizedConstructor {
  int i;
  String s;
  ParamerizedConstructor(){
    
    i=20;
    s="Rohan";
    System.out.println("In Constructor");
    System.out.println(i+" "+ s);
  }
  ParamerizedConstructor(int i,String s){
    this.i=i;
    this.s=s;
    System.out.println(i+" "+s);

  }
  public void display(){
    System.out.println("display method");
    System.out.println(i+" "+s);
  }
  ParamerizedConstructor(int a,int b,int c){
    this(10,"ramu");
    int d=(a+b+c)/2;
    System.out.println("Average of three Numbers is :"+d);
  }

  public static void main(String[] args) {
    ParamerizedConstructor p1=new ParamerizedConstructor();
    //
    ParamerizedConstructor p2=new ParamerizedConstructor(50,"rohan");
    ParamerizedConstructor p3=new ParamerizedConstructor(10,20,30);
    ConstructorDemo1 v1=new ConstructorDemo1();
    p1.display();
  }
}
