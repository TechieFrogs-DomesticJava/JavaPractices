package Patterns;
import java.util.*;
public class SandGlassPattern30 {
  public static void main(String[] args) {
  Scanner sc1=new Scanner(System.in);
    System.out.print("Enter Number of Rows you want:");
    int n=sc1.nextInt();
    for(int i = 1 ; i <=5 ; i++)
		{
			for(int k=1 ; k<i ; k++)
			{
				System.out.print(" ");
			}
			for(int j = i ; j <= n ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// Pyramid
		for(int i = n ; i>=1 ; i--)
		{
			for(int k = 1 ; k<i ; k++)
			{
				System.out.print(" ");
			}
			for(int j = n ; j>=i ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
      sc1.close();
    }
  }
  

