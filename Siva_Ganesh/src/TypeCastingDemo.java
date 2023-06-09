public class TypeCastingDemo {
  public static void main(String[] args) {
    float i=0.01f;
    int j=100;
    double d=i;
    int a=(int)d;
    i=j;//Automatic,widening,implicit conversion    
    System.out.println("Type Casting int to Float : "+i);
  }
}
