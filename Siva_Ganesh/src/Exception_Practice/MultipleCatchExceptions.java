package Exception_Practice;

public class MultipleCatchExceptions {  
    public static void main(String args[]){    
        try{    
            int array[] = new int[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException ex){  
            System.out.println(ex.getMessage());  
        }    
        catch(ArrayIndexOutOfBoundsException ex){  
            System.out.println(ex.getMessage());  
        }    
        catch(Exception ex){  
            System.out.println(ex.getMessage());  
        }    
     }    
}  

