package Interface_practice;
/*Create an interface called RegularPolygon with two abstract methods: getNumSides and getSideLength.
 • A class EquilateralTriangle that implements the interface, has getNumSides return 3 and getSideLength 
 return an instance variable that is set by the constructor. 
• A class Square that implements the interface, has getNumSides return 4 and getSideLength return an instance 
variable that is set by the constructor. 
 */
/*
1.(b)
 Add a static totalSides method, that given a RegularPolygon[], returns the sum of the 
number of sides of all the elements. 
1.(c) 
Add two default methods: 
• getPerimeter (n * length, where n is the number of sides) 
• getInteriorAngle ( (n-2)π/n in radians) 4. Make a few test cases.
 */
public interface RegularPolygon {
  int getNumSides();
  int getSideLength();
  static int totalSides(){
    return 0;
  }
  default void getPerimeter(int n,int length){
    
    int result =n*length;
    System.out.println("GetPerimeter : "+result);

  }
  default void getInteriorAngle(int n){
    double pi=22/7;
    double result=((n-2)*pi/n);
    System.out.println("GetInteriorAngle : "+result);
  }
}
class EquilateralTriangle implements RegularPolygon{
  int length;
  public EquilateralTriangle(int length) {
    this.length = length;
  }

  @Override
  public int getNumSides() {
    return 3;
  }

  @Override
  public int getSideLength() {
    return length;
  }
  
}
class Square implements RegularPolygon{
  int length;
  public Square(int length) {
    this.length = length;
  }

  @Override
  public int getNumSides() {
   return 4;
  }

  @Override
  public int getSideLength() {
    return length;
  }
  public static void main(String[] args) {
    EquilateralTriangle e1=new EquilateralTriangle(6);
    Square s1=new Square(8);
    System.out.println("Equilateral Triangle getNum side : "+e1.getNumSides());
    System.out.println("Equilateral Get sideLength : "+e1.getSideLength());
    System.out.println("Square Triangle getNum side : "+s1.getNumSides());
    System.out.println("Square Get sideLength : "+s1.getSideLength());
    e1.getPerimeter(e1.getNumSides(),e1.length);
    e1.getInteriorAngle(e1.getNumSides());
    s1.getPerimeter(e1.getNumSides(),s1.length);
    s1.getInteriorAngle(s1.getNumSides());
  }
}
