package Abstraction_Assignment;
/*We have to calculate the area of a rectangle, a square and a circle.
 Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' 
 taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
  The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' 
  is its side and that of 'CircleArea' is its radius. Now create another class 'Area' 
  containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
  for printing the area of rectangle, square and circle respectively. Create an object of class
   'Area' and call all the three methods. */
abstract public class Shape {
  abstract public int rectangleArea(int length,int breadth);
  abstract public int squareArea(int side);
  abstract public int circleArea(int radius);
}
class SquareArea extends Shape{

  @Override
  public int rectangleArea(int length, int breadth) {
    int result=length*breadth;
    return result;
  }

  @Override
  public int squareArea(int side) {
    int result=side*side;
    return result;
  }

  @Override
  public int circleArea(int radius) {
    int result=radius*radius;
    return result;
  }
  public static void main(String[] args) {
    SquareArea s1=new SquareArea();
    System.out.println("The are of circle is : "+s1.circleArea(5));
    System.out.println("The area if rectangle is : "+ s1.rectangleArea(4,6));
    System.out.println("The area of Square is : "+s1.squareArea(7));
  }
}
