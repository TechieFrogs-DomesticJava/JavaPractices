package Exception_Practice;


   class Animal {  
     
    void eat(String name) {  
    System.out.println(name );  
    }  
    void show(String name) {  
    System.out.println(name );  
    }  
    }  
    class Dog extends Animal{  
      void bark(){
        System.out.println("Barking");
      }
    void eat(String name) {  
    System.out.println( " is eating ");  
    }  
    } 
    class Cat extends Animal{
        void meow(){
            System.out.println("Meow");
        }
    } 
      
public class ClassCastException {  
    public static void main(String[] args) {  
        Dog d1=new Dog();
        Cat c1=new Cat();
        Animal animal = c1;
    try{
    if(d1 instanceof Dog)
         
      ((Dog)animal).bark();
    }
    catch(Exception ex){
        System.out.println(ex);
    }
}  
}
