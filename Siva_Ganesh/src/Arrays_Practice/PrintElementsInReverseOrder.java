package Arrays_Practice;

public class PrintElementsInReverseOrder {
  public static void main(String[] args) {
    
    int arr1[]={3,2,6,5,8,6};
    int arr2[]=new int[arr1.length];
    int n=arr1.length;

    for(int i=0;i<arr1.length;i++){
      arr2[n-1]=arr1[i];
      n=n-1;
      
    }
    for(int k=0;k<arr2.length;k++){
      System.out.print(arr2[k]+" ");
    }
  }
}
