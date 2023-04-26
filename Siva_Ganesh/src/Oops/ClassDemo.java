package Oops;

public class ClassDemo {
  static String Organisation="TechieFrogs";
  public static void main(String[] args) {
    Organisation s1=new Organisation();
    Organisation s2=new Organisation();
    s1.name="varun";
    s1.id=001;
    s2.name="Siva";
    s2.id=002;
    System.out.println("Organisation = "+Organisation+" "+"id = "+s1.id+" "+"name = "+s1.name);
    System.out.println("Organisation = "+ClassDemo.Organisation+" "+"id = "+s2.id+" "+"name = "+s2.name);
    s1.completeTasks();
    
    s1.attendClasses();
    s2.completeTasks();
    
    s2.attendClasses();
  }
}
class Organisation extends ClassDemo{
  String name;
  int id;
  public void completeTasks(){
    System.out.println(name+" is complete tasks and id is "+id+" Organisation is "+Organisation);
  }
  public void attendClasses(){
    System.out.println(name+" is Attend classesand id is "+id+" Organisation is "+Organisation);
  }
}
