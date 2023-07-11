package Collections;

import java.util.ArrayList;

// Remove the third element from an array list.
public class ArrayListExercise6 {
  public static void main(String[] args) {
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(21);
    num.add(38);
    num.add(99);
    num.add(63);
    System.out.println("Before removing the element : "+num);
    num.remove(3);
    System.out.println("After Removing the element :"+num);
    ArrayList<Integer> num2=new ArrayList<Integer>();
    num2.add(20);
    num2.add(33);
    num2.add(45);
    num2.add(43);
    Boolean bool=num.equals(num2);
    System.out.println(bool);
    System.out.println("Before triming the size of list : "+num2.size());
    num2.trimToSize();
    System.out.println("After trimming the Size of List : "+num2.size());
    num.ensureCapacity(20);
    System.out.println("After increase the size of Array list"+num.size());

  }
}
