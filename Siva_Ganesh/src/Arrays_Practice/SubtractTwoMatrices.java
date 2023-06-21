package Arrays_Practice;

public class SubtractTwoMatrices {
  public static void main(String[] args) {
    
  
  int rows,cols;
  int a[][]={{10,4,3},{2,5,4},{7,5,8}};
  int b[][]={{2,0,2},{1,4,2},{3,3,7}};
  rows=a.length;
  cols=a[0].length;
  int diff[][] =new  int [rows][cols];
  
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      diff[i][j]=a[i][j]-b[i][j];
    }
  }
  System.out.println("After subtracting Two matrices");
   for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      System.out.print(diff[i][j]+ " ");
    }
    System.out.println();
  }
}
}
