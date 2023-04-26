import java.util.*;
public class Palindrome15 {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc1.nextInt();
    int sum=0,r,temp;
    temp=num;    
    while(num>0){    
     r=num%10;  //getting remainder  
     sum=(sum*10)+r;    
     num=num/10;    
    }    
    if(temp==sum){
      System.out.println("Number is palindrome: "+sum);
    }
    else{
      System.out.println("Number is not a palindrome: "+sum);
    }
    sc1.close();
  }
}
