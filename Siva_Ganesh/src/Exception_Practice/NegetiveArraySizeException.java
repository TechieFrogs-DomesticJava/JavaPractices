package Exception_Practice;

public class NegetiveArraySizeException {
  
    public static void main(String args[])
    {
        int size=Integer.MIN_VALUE;
        try
        {
            String[] s=new String[size];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Array underflow");
            System.out.println(e.toString());
        }
    }
}




