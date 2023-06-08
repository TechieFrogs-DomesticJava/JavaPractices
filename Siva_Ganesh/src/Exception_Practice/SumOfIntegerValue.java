package Exception_Practice;
import java.util.Scanner;
import java.lang.NumberFormatException;
public class SumOfIntegerValue {
 

 public static void main(String [] args)
  {
   Scanner sc1=new Scanner(System.in);
   int sum=0,num=0;
   try
    {
      System.out.print("Input Number:");
       String temp=sc1.nextLine();
       num=Integer.parseInt(temp);
        for(int i=0;i<temp.length();i++)
         {   
          sum=sum+(num%10);
          num=num/10;
         }
      System.out.println("NUMBER:"+temp);
      System.out.print("SUM OF "+temp+" is:"+sum);
    }
   catch(NumberFormatException e)
    {
      System.out.print("Error:: Enter Only Numeric Value");
    }
    sc1.close();
  }
}

