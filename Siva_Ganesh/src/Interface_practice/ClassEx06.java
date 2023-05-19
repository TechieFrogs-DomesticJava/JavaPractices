package Interface_practice;
/*Create three interfaces, each with two methods. Inherit a new interface from the three,
 adding a new method. Create a class by implementing the new interface and also inheriting 
 from a concrete class. Now write four methods, each of which takes one of the four interfaces 
 as an argument. In main( ), create an object of your class and pass it to each of the methods. */
public class ClassEx06 {
  static void first(First f) {
    f.firstOne();
    f.firstTwo();
}

static void second(Second s) {
    s.secondOne();
    s.secondTwo();
}

static void third(Third t) {
    t.thirdOne();
    t.thirdTwo();
}

static void comb(Combined c) {
    c.combined();
}

public static void main(String[] args) {
    SuperCombined sc = new SuperCombined();
    first(sc);
    second(sc);
    third(sc);
    comb(sc);
    
}
}
interface First {
  void firstOne();

  void firstTwo();
}

interface Second {
  void secondOne();

  void secondTwo();
}

interface Third {
  void thirdOne();

  void thirdTwo();
}

interface Combined extends First, Second, Third {
  void combined();
}

class Base {
  public Base() {

  }

}

class SuperCombined extends Base implements Combined {
  public SuperCombined() {

  }

  @Override
  public void firstOne() {
      System.out.println("In the firstOne");

  }

  @Override
  public void firstTwo() {
      System.out.println(" In the firstTwo");

  }

  @Override
  public void secondOne() {
      System.out.println("In the secondOne");

  }

  @Override
  public void secondTwo() {
      System.out.println("In the secondTwo");

  }

  @Override
  public void thirdOne() {
      System.out.println("In the thirdOne");

  }

  @Override
  public void thirdTwo() {
      System.out.println("In the thirdTwo");
  }

  @Override
  public void combined() {
      System.out.println("In the combined");

  }
}


  
