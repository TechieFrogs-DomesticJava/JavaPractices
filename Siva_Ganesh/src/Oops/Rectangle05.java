package Oops;

 class Rectangle  {
  int a,b;
  Rectangle(int a,int b){
    this.a=a;
    this.b=b;
  }
  int Area(){
    int Area=a*b;
    return Area;
  }
  int R1(){
    return a*b;
  }
}
public class Rectangle05{
  public static void main(String[] args) {
    Rectangle r1=new Rectangle(4,5);
    Rectangle r2=new Rectangle(5,8);
    System.out.println(r1.Area());
    System.out.println(r2.Area());
    

  }
}
