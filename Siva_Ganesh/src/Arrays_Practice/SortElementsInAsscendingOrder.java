package Arrays_Practice;

public class SortElementsInAsscendingOrder {
  public static void main(String[] args) {
  int temp=0;
  int arr1[]={22,34,78,12,66,45,32,13,4};
  System.out.println("Array Before Sorting");
  for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i]+" ");
  }
  System.out.println(" ");
  for(int i=0;i<arr1.length;i++){
    for(int j=i+1;j<arr1.length;j++){
      if(arr1[i]>arr1[j]){
        temp=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=temp;
      }
    }
  }
  System.out.println("After Sorting in Ascending Order of an  Array");
  for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i]+" ");
  }
}
}