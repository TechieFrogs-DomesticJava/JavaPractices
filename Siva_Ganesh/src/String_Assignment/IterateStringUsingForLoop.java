package String_Assignment;

public class IterateStringUsingForLoop {
    public static void main(String[] args) {
      String name = "University";

    System.out.println("Characters in " + name + " are:");

    // loop through each element
    for(int i = 0; i<name.length(); i++) {

      // access each character
      char a = name.charAt(i);
      System.out.print(a + ", ");
    }
}
}
