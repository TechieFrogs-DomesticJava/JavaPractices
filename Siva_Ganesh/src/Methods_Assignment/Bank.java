package Methods_Assignment;
/*A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
 We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses
 named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the 
 amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the 
 three banks.
 */
public class Bank {
  int n;
  public int getBalance(int n){
    return 0;
  }
}
class BankA extends Bank{
  public int getBalance(int n){
    return n;
  }
  }

class BankB extends Bank{
  public int getBalance(int n){
    return n;
  }
  }

class BankC extends Bank{
   public int getBalance(int n){
    return n;
  }
  }
class Bank1{
  public static void main(String[] args) {
    Bank b=new Bank();
    BankA b1=new BankA();
    BankB b2=new BankB();
    BankC b3=new BankC();
    System.out.println("In Bank Base Class : "+b.getBalance(0));
    System.out.println("In Bank A: "+b1.getBalance(1000));
    System.out.println("In Bank B: "+b2.getBalance(1500));
    System.out.println("In Bank c: "+b3.getBalance(2000));
  }

}

