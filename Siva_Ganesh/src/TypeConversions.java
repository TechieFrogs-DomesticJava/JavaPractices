public class TypeConversions {
  public static void main(String[] args) {
    String s1="123";
    int n1=Integer.parseInt(s1);
    System.out.println(n1);
    int n2=Integer.valueOf(s1);
    System.out.println(n2);
    String s=Integer.toString(n2);
    System.out.println(s+10);
    s=String.valueOf(n1);
   System.out.println(s+101);
   s=String.format("%d", n1);
   System.out.println("String Format : "+s);
  }
}
