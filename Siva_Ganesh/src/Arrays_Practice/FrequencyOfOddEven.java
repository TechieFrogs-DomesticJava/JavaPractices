package Arrays_Practice;

public class FrequencyOfOddEven {
  public static void main(String[] args) {
    int rows,colns,Even=0,Odd=0;
    int arr[][]={{12,55,67},{23,33,34},{56,65,66}};
    rows=arr.length;
    colns=arr[0].length;
    for(int i=0;i<rows;i++){
      for(int j=0;j<colns;j++){
        if(arr[i][j]%2==0){
          Even++;
        }
        else{
          Odd++;
        }
      }
    }
    System.out.println("Counting Even number are : "+Even);
    System.out.println("Counting Odd numbers are : "+Odd);
}
}