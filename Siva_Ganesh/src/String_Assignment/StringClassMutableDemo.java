package String_Assignment;

public class StringClassMutableDemo {
  public static void main(String[] args) {
    StringBuffer var1=new StringBuffer();
   var1.ensureCapacity(20);
    var1.append("Hell Every One");
    System.out.println(var1+" "+var1.capacity());
    String str="Welcome";
    StringBuffer str1=new StringBuffer(str);
    System.out.println(str1+ " "+str1.capacity());
    var1.append("Hey!");
    System.out.println(var1);
    var1.insert(var1.length(),"Good morning");
    System.out.println(var1);
    var1.replace(0, 4, "Hello");
    System.out.println(var1);
    Stringintern(var1);
    
  }

  private static void Stringintern(StringBuffer var1) {
  }
}
