package Methods_Assignment;


  
/*Create a class named 'PrintNumber' to print various numbers of different datatypes
 by creating different methods with the same name 'printn' 
 having a parameter for each datatype.*/

 public class PrintNumber {

   

  // Method to print an integer

  public void printn(int num) {

      System.out.println("Integer Value is : " + num);

  }

 

  // Method to print a float

  public void printn(float num) {

      System.out.println("Float value is : " + num);

  }

 

  // Method to print a double

  public void printn(double num) {

      System.out.println("Double value is  : " + num);

  }

 

  // Method to print a long

  public void printn(long num) {

      System.out.println("Long value is: " + num);

  }

 

  // Method to print a boolean

  public void printn(boolean value) {

      System.out.println("Boolean value is : " + value);

  }

 

  // Method to print a string

  public void printn(String str) {

      System.out.println("String value is: " + str);

  }

 

  // Main method to test the class

  public static void main(String[] args) {

      PrintNumber obj = new PrintNumber();

      obj.printn(10);

      obj.printn(3.14f);

      obj.printn(3.14159);

      obj.printn(100000000000L);

      obj.printn(true);

      obj.printn("Hello, world!");

  }

}