package Arrays_Practice;

public class SumOfItemsInArray {
  public static void main(String[] args) {
    int sum=0;
    int arr1[]={3,2,7,77,33,6,5,8,6};
    for(int i=0;i<arr1.length;i++){
       sum=sum+arr1[i];
    }
    System.out.println("sum of Array : "+sum);
  }
}
