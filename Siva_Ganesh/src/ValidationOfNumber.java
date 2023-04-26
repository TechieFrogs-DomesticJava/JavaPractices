import java.util.*;
public class ValidationOfNumber {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    
    
    System.out.println("Enter positive number:");
    while(!sc1.hasNextInt()){
      
      sc1.next();
      System.out.println("This is not a number please enter number");
    }
    int num=sc1.nextInt();
    while(num<=0){
      System.out.println("your number is lessthan Zero");
      sc1.next();
    }
    System.out.println("The number is: "+num);
    sc1.close();
}
}


  

