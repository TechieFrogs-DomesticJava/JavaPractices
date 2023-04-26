import java.util.*;
public class FactorialNo {
  public static void main(String[] args) {
    
  
  Scanner sc1=new Scanner(System.in);
  System.out.print("Enter a number:");
  int num=sc1.nextInt();
  int fact=1;
  if(num!=0){
    for(int i=1;i<=num;i++){
      fact=fact*i;
    }
    System.out.println("Factorial of a Number "+ num +" is "+ fact );
  }
  sc1.close();
}
}
