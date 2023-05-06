package Oops;

public class ParentClassDemo1 extends GrandParent {
  int i=10;
  String name="Virat";
  ParentClassDemo1(){
    this(10);
    System.out.println("In Parent class constructor");
  }
  ParentClassDemo1(int i){
    super();
    System.out.println("The value of i is "+i);
  }
  public void display(){
    System.out.println("In Parent Class Method");
  }
  public static void main(String[] args) {
    
  }
}
