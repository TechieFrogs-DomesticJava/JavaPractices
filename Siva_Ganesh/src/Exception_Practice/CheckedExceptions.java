package Exception_Practice;
import java.io.*;
import java.util.*;
public class CheckedExceptions {

 
// Main class

 
    // Main driver method
    public static void main(String[] args)
        throws FileNotFoundException
    {
 
        // Assigning null value to object of FileInputStream
        FileInputStream textfile = null;
 
        // Try block to check for exceptions
        try {
 
            // Giving path where file should exists to read
            // content
            textfile = new FileInputStream(
                "D:/SivaGaneshWorkspace/javaprogram1/TextFile.txt");
               // System.out.println(textfile);
                Scanner sc = new Scanner(textfile);
 
                while (sc.hasNextLine())
                    System.out.println(sc.nextLine());
        }
 
        // Catch block to handle exceptions
        catch (FileNotFoundException e) {
 
            // Display message when exception occurs
            System.out.println("File does not exist");
        }
    }
}

