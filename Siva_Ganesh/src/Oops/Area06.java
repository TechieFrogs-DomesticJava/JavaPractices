package Oops;
import java.util.*;
public class Area06 {
  int length,breadth;
  void setDim(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
    System.out.println(length+" "+breadth);
  
  }
  int getArea(){

    return length * breadth;
  }
}
class Area{
  public static void main(String[] args) {
    Area06 a1=new Area06();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Length value :");
    a1.length=sc.nextInt();

    System.out.print("Enter the Breadth value :");


    a1.breadth=sc.nextInt();

    System.out.print("Rectangle Area is :"+a1.getArea());
    
    sc.close();
  }
}
