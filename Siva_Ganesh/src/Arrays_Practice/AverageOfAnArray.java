package Arrays_Practice;

public class AverageOfAnArray {
  public static void main(String[] args) {
    int sum=0;
    int arr[]={2,4,5,7,3,5,8};
    for (int i : arr) {
      sum=sum+i;
    }
    int Average=sum/(arr.length);
    System.out.print("Average of an array : "+Average);
  }
}
