package Arrays_Practice;
public class ArraysDemo {
  static void sum(int a[]){
    int sum=0;
    System.out.println("Sum of Array Elements : ");
    for (int i : a) { 
       sum=sum+i;  
    }
    System.out.println("Sum of array is :"+sum);
  }
  public static void main(String[] args) {
    int Arr[]=new int[10];
    Arr[0]=20;
    Arr[1]=30;
    Arr[2]=40;
    Arr[5]=70;
    Arr[9]=88;
    for(int i=0;i<Arr.length;i++){
      System.out.println(Arr[i]);

    }
    System.out.println("\n");
    String Arr1[]={"abc","cde","efg","hij"};
    for(int j=0;j<Arr1.length;j++){
      System.out.println(Arr1[j]);
    }
    System.out.println("\n");
    //Printing reverse of an Array
    System.out.println("Printing reverse Of an Array");
    for(int a1=Arr.length-1;a1>=0;a1--){
      System.out.println(Arr[a1]);
    }
    System.out.println("\n");
    // For each loop 
    System.out.println("Foreach Loop : ");
    for ( String s1  : Arr1) {
     
      System.out.println(s1);
 
  }
  sum(Arr);
  ///Anonymous array
  System.out.println("annonymous Array"+" "+ new int[]{1,2,3,4,5,6}[2]);
  sum(new int[]{1,2,3,4,5,6});
  System.out.println("");
  int a[]=new int[]{1,2,3};
}
}
