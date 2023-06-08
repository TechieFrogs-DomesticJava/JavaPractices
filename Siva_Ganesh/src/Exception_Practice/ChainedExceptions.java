package Exception_Practice;
import java.util.Scanner;  
public class ChainedExceptions {
    public static void main(String[] args) {  
// create a new Scanner object to read user input from the console  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a positive integer: ");  
       // read the user's input as an integer  
        int num = scanner.nextInt();  
        scanner.close();  
        try {  
      // check if the input number is positive, throw an exception if it's not  
            if (num < 0) {  
                throw new IllegalArgumentException("Number must be positive");  
            }  
            int result = 100 / num;  
            System.out.println("Result: " + result);  
        } catch (IllegalArgumentException e) {  
            // create a new exception with the original Exception as the cause  
            throw new RuntimeException("Invalid input", e);  
        } catch (ArithmeticException e) {  
            // create a new exception with the original Exception as the cause  
            throw new RuntimeException("Error: division by zero", e);  
        }  
    }  
}  

