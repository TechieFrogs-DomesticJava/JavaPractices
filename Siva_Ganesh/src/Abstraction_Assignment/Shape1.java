package Abstraction_Assignment;
/*Rewrite the superclass Shape and its subclasses Circle, Rectangle and Square, as shownin the class diagram.
In this exercise, Shape shall be defined as an abstract class, which contains:
•	Two protected instance variables color(String) and filled(boolean). 
The protected variables can be accessed by its subclasses and classes in the same package.
 They are denoted with a '#' sign in the class diagram.
•	Getter and setter for all the instance variables, and toString().
•	Two abstract methods getArea() and getPerimeter() (shown in italics in the class diagram).
The subclasses Circle and Rectangle shall override the abstract methods getArea() and getPerimeter()
 and provide the proper implementation. They also override the toString().
Write a test class to test these statements involving polymorphism
 */
abstract public class Shape1 {
  protected String color="red";
  protected boolean filled=true;
  @Override
  public String toString() {
    return "color= " + color + "  filled= " + filled ;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public boolean isFilled() {
    return filled;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  abstract public void getArea();
  abstract public void getPerimeter();
  Shape1(){

  }
  Shape1(String color,boolean filled){

  }
}
class Circle extends Shape1{
  protected double radius=1.0;
  @Override
  public String toString() {
    return super.toString()+" "+"radius=" + radius ;
  }
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }
  public Circle(double radius){
    this.radius=radius;
  }
  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  Circle(){

  }

  @Override
  public void getArea() {
    
  }

  @Override
  public void getPerimeter() {

  }

}
class Rectangle extends Shape1{
  protected double width=1.0;
  protected double length=1.0;
  @Override
  public String toString() {
    return super.toString()+" "+"width=" + width + "length=" + length ;
  }
  Rectangle(){

  }
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public Rectangle(String color, boolean filled, double width, double length) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public void getArea() {
    
  }

  @Override
  public void getPerimeter() {
    
  }
  
}
class Main{
  public static void main(String[] args) {
    Rectangle r1=new Rectangle();
    Circle c1=new Circle();
    System.out.println(" "+r1.toString());
    System.out.println(" "+c1.toString());
    
  }
}
