package String_Assignment;

public class RemoveWhiteSpaces {
  public static void main(String[] args) {
    String sentence = "Wel come t o Raja Mun dry.";
    System.out.println("Original sentence: " + sentence);

    sentence = sentence.replaceAll("\\s", "");
    System.out.println("After replacement: " + sentence);
}
}
