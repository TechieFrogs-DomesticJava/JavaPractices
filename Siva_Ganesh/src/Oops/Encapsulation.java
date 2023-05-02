package Oops;
import java.util.*;
class Encaps{
  private int id;
  private String name;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
public class Encapsulation {
  
  public static void main(String[] args) {
    int a;
  String b;
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter a integer Positive value:");
    a=sc1.nextInt();
    System.out.print("Enter a String value: ");
    b=sc1.nextLine();
    Encaps e1=new Encaps();
    e1.setId(a);
    e1.setName(b);
    System.out.println("Id is "+e1.getId());
    System.out.println("Name is "+e1.getName());
    sc1.close();
  }
}
