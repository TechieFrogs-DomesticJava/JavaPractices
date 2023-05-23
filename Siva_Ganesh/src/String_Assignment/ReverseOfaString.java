package String_Assignment;

public class ReverseOfaString {
  public static String reverseString(String str){  
    StringBuilder sb1=new StringBuilder(str);  
    sb1.reverse();  
    return sb1.toString();  
}  
public static void main(String[] args) {
  System.out.println( ReverseOfaString.reverseString("Welcome to every One RadaR"));
 
}
 
}
