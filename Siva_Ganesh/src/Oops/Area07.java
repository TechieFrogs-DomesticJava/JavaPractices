package Oops;
import java.util.*;
public class Area07{
  int length,breadth;
  Area07(int k,int f){
    length=k;
    
    breadth=f;
  }
  int returnArea(){
    return length*breadth;
  }
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    int l,b;
    System.out.print("Enter l value is : ");
    l=sc1.nextInt();
    System.out.print("Enter b value is : ");
    b=sc1.nextInt();
    Area07 a1= new Area07(l,b);
    System.out.println("Area is : "+a1.returnArea());
    
    sc1.close();
  }
}
  
  

  
