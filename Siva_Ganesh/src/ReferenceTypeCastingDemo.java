class Animal{
  void eat(){
    System.out.println("Eating method");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Barking");
  }
}
public class ReferenceTypeCastingDemo {
  public static void main(String[] args) {
    Dog d1=new Dog();
    d1.bark();
    d1.eat();
    Animal animal=d1;
    animal.eat();
  }
}
