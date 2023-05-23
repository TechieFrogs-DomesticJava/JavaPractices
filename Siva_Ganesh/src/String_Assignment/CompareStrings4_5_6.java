package String_Assignment;

public class CompareStrings4_5_6 {
  public static void main(String[] args) {
    
  
  String str1=new String("welcome");
  String str4=new String("welcome");
  String str2="welcome";
  String str3="Hello";
  System.out.println(str1==str3);//str1 created using with new keyword so it checks with the reference
  System.out.println(str2==str3);
  System.out.println(str2==str3);
  System.out.println(str1.equals(str4));//equals method cannot check with the reference
  System.out.println(str1.equals(str2));
  System.out.println(str1==str4);

}
}
