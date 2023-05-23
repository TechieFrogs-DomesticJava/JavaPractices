package String_Assignment;
import java.util.Scanner;

public class CountVOwelsAndConsonents {
  public static void main(String[] args) {
    System.out.print("Enter a sentence to Classify consonents,Vowels,Digits,whiteSpaces: ");
    Scanner sc=new Scanner(System.in);
    String line = sc.nextLine();
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);

      // check if character is any of a, e, i, o, u
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

      // check if character is in between a to z
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
    }

    System.out.println("Vowels are : " + vowels);
    System.out.println("Consonants are : " + consonants);
    
    sc.close();
  }
}

