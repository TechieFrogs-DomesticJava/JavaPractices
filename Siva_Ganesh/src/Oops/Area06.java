package Oops;
import java.util.*;
class Area {
  
  int length,breadth;
  void setDim(int l,int b){
    length=l;
    breadth=b;
  }
  int getArea(){
    return length*breadth;
  }
}
public class Area06{
  public static void main(String[] args) {
    int l,b;
    Area a1=new Area();
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Length value :");
    l=sc.nextInt();

    System.out.print("Enter the Breadth value :");


    b=sc.nextInt();
    a1.setDim(l, b);
    System.out.print("Rectangle Area is :"+a1.getArea());
    
    
    sc.close();
  }
}
