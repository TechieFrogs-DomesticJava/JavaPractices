package Methods_Assignment;
/*Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
 */
public class PrintIntegerCharacter {
  public void display(int n,char c){
    System.out.println("Integer value: "+n+" "+"Character Value: "+c);
  }
  public void display(char c,int n){
    System.out.print("Character Value: "+c+" "+"Integer value: "+n);
  }
  public static void main(String[] args) {
    PrintIntegerCharacter p1=new PrintIntegerCharacter();
    p1.display(10, 'A');
    p1.display('B', 20);
  }
}
