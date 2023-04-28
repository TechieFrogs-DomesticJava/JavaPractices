package Oops;

public class Student02 {
  
  
  
  public static void main(String[] args) {
    Student1 s1=new Student1();
    Student1 s2=new Student1();
    s1.rollnumber=01;
    s1.name="Sam";
    s1.Address="1/288/1";
    s1.phonenumber=1234987654;
    s2.rollnumber=02;
    s2.name="john";
    s2.Address="1/289/2";
    s2.phonenumber=1345678905;


    s1.display();
    s2.display();
  }
}
class Student1{
  int rollnumber,phonenumber;
  String Address,name;
  void display(){
    System.out.println("RollNumber  is "+rollnumber+","+"Name is "+name+","+"phonenumber is "+phonenumber+","+"Address is "+Address);
  }
}
