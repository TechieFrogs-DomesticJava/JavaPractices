public class Test {
  public static void main(String[] args) {
  int[] arr1=new int []{12,13};
  int arr2[]={1,2,3,4,5,};
  int a,b,c,d;
  a=b=c=d=20;
  a-=b+=c*=d/20;
  System.out.println(a+" "+b+" "+" "+c+" "+d);
  
  int a=10,b=20;
  while(a<b){
    System.out.println("greater");
    break;
  }
  System.out.println("lesser");

}
}
