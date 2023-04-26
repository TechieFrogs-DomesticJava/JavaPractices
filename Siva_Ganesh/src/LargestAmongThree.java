public class LargestAmongThree {
  public static void main(String[] args) {
    int a,b,c;
    a=60;b=40;c=30;
    if(a>b && a>c){
      System.out.println("a is larger number:"+a);
    }
    else if(b>a && b>c){
      System.out.println("b is larger number:"+b);
    }
    else{
      System.out.println("c is larger number:"+c);
    }
  }
}
