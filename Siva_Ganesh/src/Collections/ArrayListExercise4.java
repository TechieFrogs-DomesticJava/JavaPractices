package Collections;

import java.util.ArrayList;

// Retrieve an element (at a specified index) from a given array list.
public class ArrayListExercise4 {
  public static void main(String[] args) {
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(20);
    num.add(33);
    num.add(45);
    num.add(43);
    System.out.println(num.get(2));
  }
}
