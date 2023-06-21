package Arrays_Practice;

public class SparseMatrixDemo {
  public static void main(String[] args) {
    int rows,colns,size,count=0;
    int arr[][]={{1,0,0},{0,3,0},{0,0,4}};
    rows=arr.length;
    colns=arr[0].length;
    size=rows*colns;
    for(int i=0;i<rows;i++){
      for(int j=0;j<colns;j++){
        if(arr[i][j]==0){
          count++;
        }
            
      }
    }
    if(count>(size/2)){
      System.out.println("The given Matrix is Sparse Matrix");
    }
    else{
      System.out.println("The given matrix is not a Sparse matrix");
    }
  }
}
