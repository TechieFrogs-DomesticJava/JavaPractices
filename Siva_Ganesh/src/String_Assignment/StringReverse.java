package String_Assignment;
import java.util.Scanner;
public class StringReverse {
  public static void main(String[] args) {
    String reve="";
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a values : ");
    int num=sc.nextInt();
    sc.nextLine();
    String str=sc.nextLine(); 
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
         reve=ch+reve; 
    }
    System.out.println(reve);
    System.out.println(num);
  }
}
class BiggestNum{
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter the Array Size : ");
    int n=sc1.nextInt();
    int arr1[]=new int[n];
    int largest=0;
    for(int i=0;i<arr1.length;i++){
      System.out.print("Enter Array value At Index "+i+" : ");
      arr1[i]=sc1.nextInt();
    }
    for(int i=0;i<arr1.length;i++){
      
        if(arr1[i]>largest){
            largest=arr1[i];
        }
    }
    System.out.println("Largest Number in the Array is :"+largest);
  }
}
