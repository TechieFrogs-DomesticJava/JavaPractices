package Collections;

import java.util.ArrayList;

// Insert an element into the array list at the first position
public class ArrayListExercies3 {
  public static void main(String[] args) {
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(20);
    num.add(33);
    num.add(45);
    num.add(43);
    System.out.println("Before manipulation of List : "+num);
    num.add(0,23);
    System.out.println("After manipulation of List : "+num);
  }
}
