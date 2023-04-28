package Oops;

public class Employee10 {
  String name ; int  year_of_joining; int salary; String address;
  Employee10(String name , int  year_of_joining, int salary, String address){
    this.name=name;
    this.year_of_joining=year_of_joining;
    this.salary=salary;
    this.address=address;
  }
  void display(){
    //System.out.println("Name        Year of joining    salary       Address");
    System.out.println(name+"       "+year_of_joining+"     "+salary+"       "+address);
  }
  public static void main(String[] args) {
    System.out.println("Name   Year_of_joining  salary    Address");
    Employee10 e1=new Employee10("Robert",1994,50000,"64C-WallsStreat");
    Employee10 e2=new Employee10("Sam   ",2000,350000,"68D-WallsStreat");
    Employee10 e3=new Employee10("John  " , 1999,450000, "26B- WallsStreat");
    e1.display();
    e2.display();
    e3.display();



  }
}
