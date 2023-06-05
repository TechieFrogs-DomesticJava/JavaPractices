package Arrays_Practice;

public class SecondSmallestNumber {
  public static int ThirdLargestElement(int arr1[],int total){
    
    int temp=0;
    
    
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
    System.out.println("After Sorting");
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println(" ");
    
    return (arr1[1]);
  }
  
  public static void main(String[] args) {
    int arr1[]={22,34,78,12,66,45,32,13,4};
    int total=arr1.length;
    System.out.println(ThirdLargestElement(arr1,total));
  } 
}

