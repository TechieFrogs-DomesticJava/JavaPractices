import java.util.*;
public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num=sc1.nextInt();
    if(num%2!=0 && num%num==0 && num%1==0){
      System.out.println("Number is Prime number :"+num);
    }
    else{
      System.out.println("Number is not a prime Number :"+num);
    }
    sc1.close();
  }
}
