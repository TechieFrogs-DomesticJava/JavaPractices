package Methods_Assignment;
/*Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number of parameters.
 The method for printing area of rectangle has two parameters which are length and breadth
 respetively while the other method for printing area 
 of square has one parameter which is side of square.
________________________________________
 */
public class AreaOfRectSquare {
  public void area(int l,int b){
    int result=l*b;
    System.out.println("Area of Rectangle is: "+result);
  }
  public void area(int a){
    int result=a*a;
    System.out.println("Area of Square is: "+result);
  }
  public static void main(String[] args) {
    AreaOfRectSquare a1=new AreaOfRectSquare();
    a1.area(5, 6);
    a1.area(6);
  }
}
