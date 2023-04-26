package Patterns;
import java.util.*;
public class FullPyramid22 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter number of Rows:");
    int n=sc1.nextInt();
    for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {    
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc1.close();
  }
}
