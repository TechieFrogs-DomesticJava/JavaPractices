package Oops;
import java.lang.Math; 
public class Triangle04 {
  int a,b,c;
  Triangle04(int a,int b,int c){
    this.a=a;
    this.b=b;
    this.c=c;

    int s= (a+b+c)/2;
    double area;
    int perimeter=(a+b+c);
    System.out.println("Perimeter is "+perimeter);
    area= Math.sqrt( s*(s-a)*(s-b)*(s-c) );
  
  if ((a+b)<c  || (a+c)<b||(b+c)<a ){
    System.out.println("Invalid Triangle");
  }
  else{
    System.out.println("The area is "+area);
  }
  }
}
  class Triangle{
  public static void main(String[] args) {
    Triangle04 t1=new Triangle04(3,4,5);
  }
}

