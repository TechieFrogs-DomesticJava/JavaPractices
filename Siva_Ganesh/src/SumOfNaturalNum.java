import java.util.*;
public class SumOfNaturalNum {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter a   natural number where you want sum:");
    int num=sc1.nextInt();
    int sum=0;
    for(int i=0;i<=num;i++){
      sum=sum+i;
      System.out.println("Sum of Natural numbers is:"+sum);
    }
    sc1.close();
  }
}
