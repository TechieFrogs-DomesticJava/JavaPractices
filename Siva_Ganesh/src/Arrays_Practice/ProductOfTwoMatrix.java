package Arrays_Practice;

public class ProductOfTwoMatrix {
  public static void main(String[] args) {
    int row1,col1,row2,col2;
     
    int a[][]={{1,2,3},{3,2,4},{5,4,6}};
    int b[][]={{5,1,2},{4,7,2},{6,2,4}};
    row1=a.length;
    col1=a[0].length;
    row2=b.length;
    col2=b[0].length;
    int prodMat[][]=new int[row1][col2];
    if(row2!=col1){
      System.out.println("Matrices are Not equal");
    }
    else{
   
    for(int i=0;i<row1;i++){
      for(int j=0;j<col2;j++){
        for(int k=0;k<row2;k++){
            prodMat[i][j]=prodMat[i][j]+a[i][k]*b[k][j];
        }
      }
    }
  }
  for(int i=0;i<row1;i++){
      for(int j=0;j<col2;j++){
        System.out.print(prodMat[i][j]+" ");
  }
  System.out.println();
}
  }
}
