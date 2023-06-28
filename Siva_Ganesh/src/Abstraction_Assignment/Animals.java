package Abstraction_Assignment;
/*Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' 
with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
 Now create an object for each of the subclasses and call their respective methods. */
abstract public class Animals {
  abstract public void cats();
  abstract public void dogs();
}
class Cats extends Animals{

  @Override
  public void cats() {
    System.out.println("Cats meow");
  }

  @Override
  public void dogs() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dogs'");
  }

} 
  class Dogs extends Animals{
    @Override
  public void dogs() {
    System.out.println("Dogs Bark");
  }
  public static void main(String[] args) {
    Dogs d1=new Dogs();
    Cats c1=new Cats();
    d1.dogs();
    c1.cats();
  }
  @Override
  public void cats() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cats'");
  }
}

