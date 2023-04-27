package Oops;
import java.lang.Math;
 class Triangle03 {
  Triangle03(){
    int a=3,b=4,c=5;
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
  class Traingle{
  public static void main(String[] args) {
    Triangle03 t1=new Triangle03();
  }
}
