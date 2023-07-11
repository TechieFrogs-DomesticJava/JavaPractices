import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> stk=new Stack<>();
    stk.push(10);
    stk.push(44);
    stk.push(56);
    stk.push(32);
    int index=stk.search(56);
    System.out.println("Pop element is : "+stk.pop());
    System.out.println("By using peek method retrive the last element : "+stk.peek());
    Boolean bool=stk.empty();
    System.out.println("Empty method returns true or false : "+bool);
    
    System.out.println(" element index is :"+index);
    for (Integer integer : stk) {
      System.out.println(integer);
    }
  }
}
