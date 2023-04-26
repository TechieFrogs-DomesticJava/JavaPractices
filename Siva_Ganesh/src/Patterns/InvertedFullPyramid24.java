package Patterns;
import java.util.*;
public class InvertedFullPyramid24 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
  System.out.print("Enter number of Rows:");
  int rows =sc1.nextInt();

    for(int i = rows; i >= 1; --i) {
      for(int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j=i; j <= 2 * i - 1; ++j) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; ++j) {
        System.out.print("* ");
      }

      System.out.println();
    }sc1.close();
  }
}
