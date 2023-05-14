package Abstraction_Assignment;
/*Create an abstract class 'Bank' with an abstract method 'getBalance'.
 $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' 
 and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
  Call this method by creating an object of each of the three classes.
 */
abstract public class Bank {
  abstract public void getBalance();
}
class BankA extends Bank{
  public void getBalance(){
    System.out.println("Deposited Amount in BankA is : $100");
  }
}
class BankB extends Bank{
  public void getBalance(){
    System.out.println("Deposited Amount in BankB is : $150");
  }
}
class BankC extends Bank{
  public void getBalance(){
    System.out.println("Deposited Amount in BankC is : $200");
  }
  public static void main(String[] args) {
    BankA a1Obj=new BankA();
    BankB b1Obj=new BankB();
    BankC c1Obj=new BankC();
    a1Obj.getBalance();
    b1Obj.getBalance();
    c1Obj.getBalance();
  }
}

