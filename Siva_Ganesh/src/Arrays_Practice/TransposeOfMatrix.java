package Arrays_Practice;

public class TransposeOfMatrix {
  public static void main(String[] args) {
    int rows,colns;
    int firstMAt[][]={{3,4,5},{1,4,2},{5,8,7}};
    int secTranspose[][]=new int[3][3];
    rows=firstMAt.length;
    colns=firstMAt[0].length;
    for(int i=0;i<rows;i++){
      for(int j=0;j<colns;j++){
        secTranspose[i][j]=firstMAt[j][i];
      }
    }
    System.err.println("Before Transpose of Matrix: ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<colns;j++){
        System.out.print(firstMAt[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("After Transpose of Matrix :");
    for(int i=0;i<rows;i++){
      for(int j=0;j<colns;j++){
        System.out.print(secTranspose[i][j]+" ");
      }
      System.out.println();
    }
  }
}
