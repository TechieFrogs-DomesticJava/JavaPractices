package Methods_Assignment;
/*A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'.
 Its subclass also has an integer data member 'j' and a method named 'printNum' to print the 
 value of 'j'. Make an object of the subclass and use it to assign a value to 'i' and to 'j'.
  Now call the method 'printNum' 
by this object. */
public class DataMember7 {
  int i;
  public void printNum(){
    System.out.println("Inter value of i is : "+i);
  }
}
class ChildDataMember extends DataMember7{
  int j;
  public void printNum(){
    System.out.println("Integer value of j is : "+j);
  }
}
class DataMember{
  public static void main(String[] args) {
    DataMember7 d1=new DataMember7();
    ChildDataMember c1=new ChildDataMember();
    d1.i=10;
    d1.printNum();
    c1.j=20;
    c1.printNum();
  }
}
