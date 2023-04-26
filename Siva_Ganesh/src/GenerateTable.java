import java.util.*;
public class GenerateTable {
  public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.print("Enter which table you Want:");
    int n=sc1.nextInt();
    sc1.close();
    int i=1,val;
    while(i<=10){
       val=n*i;
       System.out.println(n+" * "+ i +" = "+val);
       i++;
    }
    
  }
  
}
