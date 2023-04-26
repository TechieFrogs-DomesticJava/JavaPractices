class Instancevar1{
    int id;
     String name;
  public static void main(String[] args) {
    Instancevar1 v1=new Instancevar1();
      v1.namesId(001,"siva");
      v1.display();
  }
  public   void namesId(int number,String string){
         id=number;
        name=string;
  }
  public    void display(){
    System.out.println(id);
    System.out.println(name);
  }
}