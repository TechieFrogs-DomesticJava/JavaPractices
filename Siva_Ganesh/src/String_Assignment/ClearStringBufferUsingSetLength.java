package String_Assignment;

public class ClearStringBufferUsingSetLength {
  public static void main(String[] args) {
    StringBuffer str1=new StringBuffer("Hello World");
    System.out.println("String length is : "+str1.length()+"\t"+"String  is :"+str1);
    str1.setLength(10);
    System.out.println("Sentense after SetLength :"+str1);
  }
}
