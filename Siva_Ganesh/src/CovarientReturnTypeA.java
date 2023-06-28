public class CovarientReturnTypeA {
  public  CovarientReturnTypeA get()
  {
    return this;
  } 
} 
    class B1 extends CovarientReturnTypeA{    
    @Override  
    public B1 get(){return this;}    
    void message(){System.out.println("welcome to covariant return type");}    
        
    public static void main(String args[]){    
    new B1().get().message();    
    }    
    }    