package Methods_Assignment;
/*Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
 It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method 
 with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
  Call the method by creating an object of each of the three classes.
 * 
 */
public class Degree {
  public void getDegree(){
    System.out.println("I got a degree");
  }
}
class Undergraduate extends Degree{
    public void getDegree(){
      System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree{
    public void getDegree(){
      System.out.println("I am a Postgraduate");
    }
}

  class Degree1{
    public static void main(String[] args) {
      Degree d1=new Degree();
      d1.getDegree();
       Postgraduate p1=new Postgraduate();
       p1.getDegree();
       Undergraduate U1= new Undergraduate();
       U1.getDegree();
     }
  }
  

