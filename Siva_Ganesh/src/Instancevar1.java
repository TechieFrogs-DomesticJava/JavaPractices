
 class Instancevar1{
  //static String company="techie Frogs";
 // int a,b;
    int id;
     String name;
 
  public static void main(String[] args) {
    
    Instancevar1 v1=new Instancevar1();
    
  //   v1.a=10;v1.b=20;
  //  System.out.println(v1.a+v1.b);
  //   Student in1=new Student();
  //   Student.SchoolName="TechieFrogs";
  //   in1.name="siva";
   //  in1.id=001;
   //  System.out.println(in1.name);
   //  System.out.println(in1.id);
  //   System.out.println(Instancevar1.company);
      v1.namesId(001,"siva");
      v1.display();
  }
  public  void namesId(int number,String string){
         id=number;
        name=string;
  }
  public   void display(){
    System.out.println(id);
    System.out.println(name);
  }
}
  class Student{
   // String name;
  //  int id;
  //  static String SchoolName;
  }
 
  

