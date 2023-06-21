package Arrays_Practice;
import java.util.Arrays;
public class SortArrayElements {
  public static void main(String[] args) {
    int arr[]={66,88,3,6,8,3,6,21,4};
    Arrays.sort(arr);
    System.out.println("After Sorting array : ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
