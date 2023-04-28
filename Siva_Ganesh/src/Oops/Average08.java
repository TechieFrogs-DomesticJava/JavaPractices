package Oops;
import java.util.*;
public class Average08 {
  
  void average(int a,int b,int c){
    int d=(a+b+c)/3;
    System.out.println("Average of three values is:"+d);
  }
  public static void main(String[] args) {
    int a,b,c;
    Scanner sc1=new Scanner(System.in);
    Average08 a1=new Average08();
    System.out.print("Enter a value: ");
    a=sc1.nextInt();
    System.out.print("Enter a value: ");
    b=sc1.nextInt();
    System.out.print("Enter a value: ");
    c=sc1.nextInt();
    a1.average(a,b,c);
    sc1.close();

}
  }
