package Interface_practice;
/*Prove that the fields in an interface are implicitly static and final. */
public interface FieldsStaticFinal {
  int vlaue=30;
  String name="Kartik";
}
class FieldsStaticFinal1 implements FieldsStaticFinal{
  public static void main(String[] args) {
    FieldsStaticFinal1 f1=new FieldsStaticFinal1();
    //static fields are invoked in a static way
   // FieldsStaticFinal.name="ramu";//final field cannot be assigned
    System.out.println("value : "+FieldsStaticFinal.vlaue+" "+"Name: "+FieldsStaticFinal.name);
  }
}
