package Oops;
import java.lang.String;
public class StringClassDemo {

  
  public static void main(String[] args) {
    StringClassDemo d1=new StringClassDemo();
    String str4="Frogs";
    String str3="@123asd";
    String str2 ="@123asd";
    String str="Techie Frogs";
    String str5=str.concat(str4);
    String str1=new String("@123asd");
  /*   System.out.println(str2.equals(str3));
    System.out.println(str4);
    System.out.println(str5);
    System.out.println(str2.equalsIgnoreCase(str3));
    System.out.println(str.compareTo(str1));
    System.out.println(str.concat(str4));
    System.out.println(str2.compareTo(str3));
    System.out.println(str3==str2);
    System.out.println(str1==str2);*/
    System.out.println(str.substring(6));
    System.out.println(str.substring(0));
    System.out.println(str.replace("Techie", "Normal"));
    System.out.println(str.indexOf('T'));
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    
  }
}
