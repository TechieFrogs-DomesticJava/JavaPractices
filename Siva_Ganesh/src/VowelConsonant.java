import java.util.*;
public class VowelConsonant {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a value:");
    int b=sc.nextInt();
    int c=sc.nextInt();
    String v1=sc.next();
    sc.nextLine();
    String s1=sc.nextLine();
    sc.close();
    char a='i';
    if(a=='a'|| a=='e'||a=='i' ||a=='o'|a=='u'){
      System.out.println("Alphabet is VOwel ie is:"+ a);
    }
    else{
      System.out.println("Alphabet is a Consonent ie is:"+ a);
    }
    System.out.println("the value of B is:"+b);
    System.out.println("the value of c is:"+c);
    System.out.println("the value of s1 is:"+s1);
    System.out.println("the value of v1 is:"+v1);
}
}