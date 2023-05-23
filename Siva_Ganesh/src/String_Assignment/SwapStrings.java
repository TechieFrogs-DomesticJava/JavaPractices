package String_Assignment;

public class SwapStrings {
  public static void main(String args[]) {  
    String a = "Techie";  
    String b = "Frogs";  
    System.out.println("Before swapping: " + a + " " + b);  
    a = a + b;  
    b = a.substring(0, a.length() - b.length());  
    a = a.substring(b.length());  
    System.out.println("After Swapping: " + a + " " + b);  
}  
}
