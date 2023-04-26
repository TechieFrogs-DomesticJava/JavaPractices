import java.util.*;
public class EvenOrOdd04 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter a Number:");
    int n=sc1.nextInt();
    if(n%2==0){
      System.out.println(n+" even number ");
    }
    else{
      System.out.println(n+" not an even Number " );
    }sc1.close();
  }
}
