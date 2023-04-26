package Patterns;
import java.util.*;
class DaimandShapePattern27{
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter Number of Rows you want:");
    int n=sc1.nextInt();
    int i,k,j;
       
       for(i=1;i<=n;i++){
        for(j=n;j>i;j--){
          System.out.print(" ");
        }
        for(k=1;k<=(2*i-1);k++){
          System.out.print("*");
        }
        System.out.println("  ");
      }
      for(i=n-1;i>=1;i--){
        for(j=n;j>i;j--){
          System.out.print(" ");
        }
        for(k=1;k<=(2*i-1);k++){
          System.out.print("*");
        }
        System.out.println("  ");
      }
      
      sc1.close();
    }
  }
  