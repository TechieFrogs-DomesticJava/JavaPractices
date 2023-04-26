public class Hello3 {
   int id=2;
  public static void main(String[] args) {
    System.out.println("This is notepad");
    
    //Hello3.id=3;
    //System.out.println(id);
   // System.out.println(args[0]+args[1]);
   Hello3 h1=new Hello3();
   System.out.println(h1.id);
    h1.display();
  }
  public  void display(){
    System.out.println(id);
  }
}
