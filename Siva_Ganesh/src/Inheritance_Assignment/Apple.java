package Inheritance_Assignment;
/*Consider a class Apple which is extended by class Banana. Class Apple contains a single integer 
member 'number_of_items'.Class Banana contains an integer member 'number_of_items',
 a constructor and a member method show() which displays the values of member variable 
 'number_of_items' of class Apple and class Banana respectively .
 */
public class Apple {
  int number_of_items;
  Apple(){
  
  
  }
  public void show(){
    System.out.println("Number of items in Apple Class : "+number_of_items);
  }
}
class Banana extends Apple{
  Banana(){
  }
  int number_of_items;
  public void show(){
    System.out.println("Number of items in Banana Class : "+number_of_items);
  }
  public static void main(String[] args) {
    Apple a1=new Apple();
    Banana b1=new Banana();
    a1.number_of_items=10;
    b1.number_of_items=20;
    a1.show();
    b1.show();
  }
}
