import java.util.*;
public class CharacterOrNot {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    
  
      
     System.out.print("Enter a character value:");
    char val=sc.next().charAt(0);;
    if(((val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z')) ){
      System.out.println("Value is an Alphabet :"+val);
      
    }
    else{
      System.out.println("Value is Not an Alphabet:"+val);
   
    }
    sc.close();
  }
}

