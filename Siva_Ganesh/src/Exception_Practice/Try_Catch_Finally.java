package Exception_Practice;

public class Try_Catch_Finally {
  public static void main(String[] args)
  {
          int a = 40, b = 4, c = 4;
          int result;
          try
          {
                  result = a / (b-c);
          }
          catch (ArithmeticException ae)
          {
                  System.out.println("Cannot divided by zero."+ae);
          }
          finally
          {
                  System.out.println("finally block");
          }
          result = a / (b+c);
          System.out.println("Result: "+result);
  }
}

