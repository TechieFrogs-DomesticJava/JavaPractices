package Patterns;
import java.util.*;
public class FloydTriangle26 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter number of rows:");
    int rows =sc1.nextInt();
    int  number = 1;

    for(int i = 1; i <= rows; i++) {

      for(int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        ++number;
      }

      System.out.println();
    }sc1.close();
  }
}
