package String_Assignment;
import java.io.*;
public class IndividualCharactorFromString {
    public static void main(String[] args)
    {
        String string = "Hello World";
        // Displays individual characters from given string
        System.out.println("Individual characters from given string: ");
        // Iterate through the given string to
        // display the individual characters
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}

