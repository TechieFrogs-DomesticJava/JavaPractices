package String_Assignment;

public class IterateEachElementOfaStringUsingForEach {
  public static void main(String[] args) {
    String name = "University";
    String str2="My name is ";
  System.out.println("Characters in " + name + " are:");
    for (char c  : name.toCharArray()) {
      System.out.print(c+",");
      
      
    }
    System.out.println(str2.contains(str2));
    System.out.println(indexOf(str2));
}
}