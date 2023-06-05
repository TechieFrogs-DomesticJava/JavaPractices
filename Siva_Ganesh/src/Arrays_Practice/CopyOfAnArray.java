package Arrays_Practice;
public class CopyOfAnArray {
  public static void main(String[] args) {
    int arr1[]=new int[5];
    arr1[0]=10;
    arr1[1]=12;
    arr1[2]=13;
    arr1[3]=22;
    arr1[4]=33;
    for (int i : arr1) {
      System.out.println(i);
    }
    System.out.println("______________________________");
    int arr2[]=arr1.clone();
    for (int i : arr2) {
      System.out.println(i);
    }
  }
}

