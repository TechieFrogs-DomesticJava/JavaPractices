package Inheritance_Assignment;
/*Write a Java program using inheritance to print the value of Counter.
Create a class Counter with class variable 'i' and method called 'increment()'.
Now write a subclass extending Counter class which calls the increment() function
 and displays the following output:
i = 3
 */
public class Counter {
  int i=3;
  public void increment(){
    System.out.println("i="+i);
  }
}
class subclass extends Counter{
  
}
class Test{
  public static void main(String[] args) {
    subclass s1=new subclass();
    s1.increment();
  }
}
