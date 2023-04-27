package Oops;

public class Student01 {
  int id;
  String name;
  Student01(int id,String name){
    this.id=id;
    this.name=name;
    System.out.println("Id value is "+id+" and "+"Name is "+name);
  }
  
  public static void main(String[] args) {
    Student01 s1=new Student01(2,"john");
    
  }
}
