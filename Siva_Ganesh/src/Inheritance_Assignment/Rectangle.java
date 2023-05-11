package Inheritance_Assignment;
/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
 two methods to print the area and perimeter of the rectangle respectively. 
 Its constructor having parameters for length and breadth is used to initialize
  length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with 
  its constructor having a parameter for its side (suppose s) calling the constructor of its parent 
  class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square. */
public class Rectangle {
  int length;
  int breadth;
  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
public void area(){
  int result=length*breadth;
  System.out.println("Area of Rectangle is : "+result);
}
public void perimeter(){
  int result=2*(length+breadth);
  System.out.println("perimete of Rectangle is : "+result);
}
public static void main(String[] args) {
  Square s1=new Square(6);
  s1.area();
}
}
class Square extends Rectangle{
 int side;

public Square(int s) {
  super(s, s);
  this.side = s;
}
public void area(){
  super.area();
  int result=side*side;
  System.out.println("Area of Square is : "+result);
}
}
