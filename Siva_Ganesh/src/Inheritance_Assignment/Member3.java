package Inheritance_Assignment;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
 'Manager' classes have data members 'specialization' and 'department' respectively. 
 Now, assign name, age, phone number, address and salary to an employee and a manager
  by making an object of both of these classes and print the same.
 */
public class Member3 {
    String  Name;
    int Age;
   String Phone_number;
    String Address;
    double Salary;
    public Member3(String name, int age, String phone_number, String address, Double salary) {
      Name = name;
      Age = age;
      Phone_number = phone_number;
      Address = address;
      Salary = salary;
    }
    public void printsalary(){
      System.out.println("Print salary : "+Salary);
    }
}
class Employee extends Member3{
  String specialization;
    
  Employee(String name, int age, String phone_number,String address, double salary, String specialization) {
        super(name, age, phone_number,address,salary); 
    this.specialization = specialization;
  }
    
    
}
class Manager extends Member3{
  String department;
  public Manager(String name, int age, String phone_number, String address, Double salary,String department) {
    super(name, age, phone_number,address,salary);
    this.department=department;
  }
}
 class Main {
  public static void main(String[] args) {
      Employee employee = new Employee("Ramesh", 25, "8985676534", "Home", 25631.5, "IT");
      Manager manager = new Manager("Suresh", 30, "9848394643", "Earth", 69586.5, "IT");
      employee.printsalary();
      manager.printsalary();
  }
}
