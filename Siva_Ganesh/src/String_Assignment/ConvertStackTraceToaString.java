package String_Assignment;
import java.io.PrintWriter;
import java.io.StringWriter;
/*3.	Java Program to Convert a Stack Trace to a String(exceptions) */
public class ConvertStackTraceToaString {
 

    public static void main(String[] args) {

        try {
            int division = 0 / 0;
        } catch (ArithmeticException e) {
            
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}
