package String_Assignment;

public class ClearTheStringBuffer {
  public static void main(String[] args) {
    StringBuffer bf=new StringBuffer();
    bf.append("Learning   ");
    bf.append("With ");
    bf.append("Techie Frogs\t");
    bf.append("is  Fun");
    System.out.println(bf.toString());
    System.out.println("After Clear the String Buffer :");
    System.out.println(bf.delete(0, bf.length()));
    
  }
}
