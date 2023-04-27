package Oops;
import java.util.*;
public class Area07 {
  int l,b;
  Area07(int length,int breadth){
    this.l=length;
    this.b=breadth;
  }
  int returnArea(){
    return l*b;
  }
}
class Area{
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    Area07 a1=new Area07(l,b);
    System.out.print("Enter a value is : ");
    a1.l=sc1.nextInt();
    System.out.print("Enter b value is : ");
    a1.b=sc1.nextInt();
    System.out.println(a1.returnArea());
  }
}
