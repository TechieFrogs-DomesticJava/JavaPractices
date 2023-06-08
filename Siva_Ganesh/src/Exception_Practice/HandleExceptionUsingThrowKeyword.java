package Exception_Practice;

public class HandleExceptionUsingThrowKeyword {

    public static void validate(int age) {  
        if(age<18) {  
            
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function
        try{  
        validate(15);  
        }
        catch(Exception e){
          System.out.println(e);
        }
        System.out.println("rest of the code...");    
  }    
}    

