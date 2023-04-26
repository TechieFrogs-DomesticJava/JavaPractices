package Patterns;
import java.util.*;
public class RightPascalTriangle28 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter Number of Rows you Want:");
    int n=sc1.nextInt();
    //Right Pascal Traingle
    for(int i=0;i<=n;i++){
       for(int j=0;j<=i;j++){
      System.out.print("*");
      }
      System.out.println(" ");
    }
  
  for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
   System.out.print("*");
   }
   System.out.println(" ");
 }sc1.close();
}
}
