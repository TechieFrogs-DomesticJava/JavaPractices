package Exception_Practice;
import java.util.Scanner;
public class NumberFormatException {

    public static void main(String[] arg)
    {
        int number;
 
        Scanner sc = new Scanner(System.in);
        while (true) {
 
            System.out.println("Enter any valid Integer: ");
 
            try {
 
                number = Integer.parseInt(sc.next());
 
                
                System.out.println("You entered: " + number);
 
                
                break;
            }
 
            
            catch (Exception e) {
 
              
                System.out.println("NumberFormatException occurred");
            }
        }
        sc.close();
    }
}

