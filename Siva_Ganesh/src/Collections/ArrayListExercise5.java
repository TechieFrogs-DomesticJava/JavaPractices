package Collections;

import java.util.ArrayList;

// . Update a specific array element by given element
public class ArrayListExercise5 {
  public static void main(String[] args) {
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(20);
    num.add(33);
    num.add(45);
    num.add(43);
    System.out.println("Before Array List : "+num);
    num.add(2,78);
    System.out.println("Index second position is updated"+num);
  }
}
