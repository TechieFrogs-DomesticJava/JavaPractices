package Patterns;
import java.util.*;
public class InvertedHalfPyramid21 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter a number:");
    int n=sc1.nextInt();
    for(int i=n;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println(" ");
    }
    sc1.close();
  }
}
