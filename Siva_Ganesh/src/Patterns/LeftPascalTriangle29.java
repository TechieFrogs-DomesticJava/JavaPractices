package Patterns;
import java.util.*;
public class LeftPascalTriangle29 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter Number of Rows you want:");
    int n=sc1.nextInt();
    int i,k,j;
    //Left Pascal Triangle
    for(i=1;i<=n;i++){
      for(j=n-1;j>=i;j--){
        System.out.print(" ");
      }
      for(k=1;k<=i;k++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
    
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(k=n-1;k>=i;k--){
        System.out.print("*");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
    sc1.close();
    //Left Pascal Triangle End Here..
  }
  }

