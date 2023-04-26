package Oops;

public class ParamerizedConstructor {
  int i;
  String s;
  ParamerizedConstructor(){
    
    i=20;
    s="Rohan";
    System.out.println("In Constructor");
  }
  ParamerizedConstructor(int i,String s){
    int k=i;
    String s1=s;
    System.out.println(k+" "+s1);

  }
  public void display(){
    System.out.println("display method");
  }
  ParamerizedConstructor(int a,int b,int c){
    this(10,"ramu");
    int d=(a+b+c)/2;
    System.out.println("Average of three Numbers is :"+d);
  }

  public static void main(String[] args) {
    ParamerizedConstructor p1=new ParamerizedConstructor();
    System.out.println(p1.i+" "+ p1.s);
    ParamerizedConstructor p2=new ParamerizedConstructor(50,"rohan");
    ParamerizedConstructor p3=new ParamerizedConstructor(10,20,30);
    p1.display();
  }
}
