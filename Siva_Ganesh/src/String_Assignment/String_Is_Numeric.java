package String_Assignment;

public class String_Is_Numeric {
  public static void main(String[] args) {

    String string = "12345.15";
    boolean numeric = true;

    try {
        Double num = Double.parseDouble(string);
        System.out.println("Parse String into a number is: "+num);
    } catch (NumberFormatException e) {
        numeric = false;
    }

    if(numeric)
        System.out.println(string + " is a number");
    else
        System.out.println(string + " is not a number");
}
}
