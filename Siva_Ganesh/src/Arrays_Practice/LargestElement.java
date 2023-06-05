package Arrays_Practice;

public class LargestElement {
  public static void main(String[] args) {
   int largest=0;
      int arr1[]={3,2,6,5,8,77,45,66,99,6,43,122};
      for(int i=1;i<arr1.length;i++){
       if(arr1[i]>largest){
        largest=arr1[i];
       }
        
    }
    System.out.println("largest Element is : "+largest);
  }
}

