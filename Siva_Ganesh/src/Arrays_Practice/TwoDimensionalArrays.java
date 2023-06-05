package Arrays_Practice;
public class TwoDimensionalArrays {
  public static void main(String[] args) {
    int Arr[][]=new int[3][3];
    Arr[0][0]=1;
    Arr[0][1]=1;
    Arr[0][2]=1;
    Arr[1][0]=2;
    Arr[1][1]=2;
    Arr[1][2]=2;
    Arr[2][0]=3;
    Arr[2][1]=3;
    Arr[2][2]=3;
    for(int i=0;i<Arr.length;i++){
      for(int j=0;j<Arr.length;j++){
        System.out.print(Arr[i][j]+" ");
      }
      System.out.println("");
    }
    System.out.println("Jogged Array");
   int OtherArr [][]={{1,2,3,6,8},{4,5},{7,8,9,11,2,6}};
   for(int i=0;i<OtherArr.length;i++){
    for(int j=0;j<OtherArr[i].length;j++){
      System.out.print(OtherArr[i][j]+" ");
    }
    System.out.println("");
  }
  int jagArr[][]=new int[3][];
   jagArr[0]=new int[2];
   jagArr[1]=new int[4];
   jagArr[2]=new int[8];
   for(int i=0;i<jagArr.length;i++){
    for(int j=0;j<jagArr[i].length;j++){
      System.out.print(jagArr[i][j]+" ");
    }
    System.out.println("");
  }
  int newCloneJagArr[][]=jagArr.clone();
  System.out.println("clone");
 
  for(int i=0;i<newCloneJagArr.length;i++){
    for(int j=0;j<newCloneJagArr[i].length;j++){
      System.out.print(newCloneJagArr[i][j]+" ");
    }
    System.out.println("");
    int arr1[]=new int[-1];
    arr1[-1]=10;
    System.out.println(arr1);
  }
}
}
