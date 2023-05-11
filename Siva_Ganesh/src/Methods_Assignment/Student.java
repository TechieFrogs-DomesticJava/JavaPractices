package Methods_Assignment;
/*Create a class 'Student' with three data members which are name, age and address.
 The constructor of the class assigns default values name as "unknown", age as '0' and 
 address as "not available". It has two members with the same name 'setInfo'. First method has 
 two parameters for name and age and assigns the same whereas the second method takes has three 
 parameters which are assigned to name, age and address respectively. Print the name, age and address 
 of 10 students.
Hint - Use array of objects
 */
public class Student {
  String name;
  int age;
  String address;
  
  

  public void setInfo(String name,int age){
    System.out.println("name :"+name+" "+"age is "+age);
  }
  public void setInfo(String name,int age,String address){
    System.out.println("name :"+name+" "+"age is: "+age+" "+"address is "+address);
  }
  public static void main(String[] args) {
    Student s1=new Student();
    s1.setInfo("UnKnown", 0);
    s1.setInfo("ramu", 12, "1-399/1");
    s1.setInfo("ravi", 11, "1-391/1");
    s1.setInfo("somu", 14, "1-392/1");
    s1.setInfo("siva", 22, "1-393/1");
    s1.setInfo("rahul", 13, "1-394/1");
    s1.setInfo("sunil", 15, "1-395/1");
    s1.setInfo("saruk", 11, "1-396/1");

    s1.setInfo("ramesh", 17, "1-397/1");
    s1.setInfo("suresh", 18, "1-398/1");


  }
}
