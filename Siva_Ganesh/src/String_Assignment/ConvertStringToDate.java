package String_Assignment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*3.	Java Program to Convert String to Date */
public class ConvertStringToDate {
  public static void main(String[] args) {
    // Format y-M-d or yyyy-MM-d
    String string = "2017-07-25";
    LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

    System.out.println(date);
}
}
