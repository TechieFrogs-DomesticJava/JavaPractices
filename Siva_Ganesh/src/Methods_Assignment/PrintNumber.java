package Methods_Assignment;
/*Create a class named 'PrintNumber' to print various numbers of different datatypes
 by creating different methods with the same name 'printn' 
 having a parameter for each datatype.*/
public class PrintNumber {
  public void printn(int n){
    System.out.println("int value is :"+n);
  }
  public void printn(double n){
    
    System.out.println("Double value is :"+n);
  }
  
  public void printn(Float n){
    System.out.println("Float value is :"+n);
  }
  public void printn(byte n){
    System.out.println("the value of Byte is:"+n);
  }
  public void printn(short n){
    System.out.println("The value of short is :"+n);
  }
  public void printn(Boolean n){
    System.out.println("The value of boolean is :"+n);
  }
  public Long printn(Long n){
    System.out.println("The value of Long is :"+n);
    return n;
  }
  public void printn(char n){
    System.out.println("The value of char is:"+n);
  }
public static void main(String[] args) {
  PrintNumber p1=new PrintNumber();
  p1.printn(10);
  p1.printn('A');
  p1.printn(true);
  p1.printn(8.9f);
  p1.printn(1000000L);
  p1.printn(3.14159);
  p1.printn(100000);
}
}
