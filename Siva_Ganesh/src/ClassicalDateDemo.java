import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ClassicalDateDemo {
  public static void main(String[] args) {
    Date d1=new Date();
    System.out.println(d1);
    // Date d2=new Date(1234567l);
    // System.out.println(d2);
    // System.out.println("From jan 1st 1970 to till now how many miliseconds : "+d1.getTime());
    // d1.setTime(3456321);
    // System.out.println(d1);
    // if(d1.after(d2)){
    //   System.out.println("yes");
    // }
    // Date d3=(Date)d1.clone();
    // System.out.println("Cloned date exp : "+d3);
    
    LocalDate l1=LocalDate.now();
   System.out.println("Local Date :"+l1);
    LocalTime t1=LocalTime.now();
    LocalDate t2=LocalDate.of(2001,2,8);
    //get the date month ,year seperately
    System.out.println("It gives the day of the month : "+t2.getDayOfMonth());
    System.out.println("It tell about the how many days in a month : "+t2.lengthOfMonth());
    System.out.println(t2.getDayOfWeek());
    // System.out.println("Local Time :"+t1);
    // LocalDateTime dt1=LocalDateTime.now();
    // System.out.println("Local DateTime : "+dt1);
    // System.out.println("My System Default Zone is : "+Clock.systemDefaultZone());
    // SimpleDateFormat dateformat=new SimpleDateFormat("MMMM-dd-yyyy hh:mm:ss z");
    // String date4=dateformat.format(d3);
    // System.out.println("Simple Date Formatter : "+date4);

  }
}
