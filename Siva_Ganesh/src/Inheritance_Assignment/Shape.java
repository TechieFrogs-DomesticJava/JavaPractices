package Inheritance_Assignment;
/*Create a class named 'Shape' with a method to print "This is This is shape".
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 both having a method to print "This is rectangular shape" and "This is circular shape" respectively.
  Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
   Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class. */
public class Shape {
  public void Print_shape(){
    System.out.println("This is shape");
  }
  
}
class Rectangle1 extends Shape{
  public void Rectangle_shape(){
    System.out.println("This is Rectangular shape");
  }
}
class Circle extends Shape{
  public void circle_shape(){
    System.out.println("This is Circular shape");
  }
}
class Square extends Rectangle1{
  public void square_shape(){
    System.out.println("Square is a rectangle");
  }
}
class Test{
  public static void main(String[] args) {
    Rectangle1 s1=new Rectangle1();
    s1.Rectangle_shape();
    s1.Print_shape();
  }
}
  
