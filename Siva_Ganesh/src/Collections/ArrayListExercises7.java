package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Search an element in an array list.
public class ArrayListExercises7 {
  public static void main(String[] args) {
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(20);
    num.add(33);
    num.add(45);
    num.add(43);
    num.add(98);
    num.add(43);
    System.out.println("Searching for a number "+num.contains(33));
    Collections.sort(num);
    System.out.println("Sorted list is : "+ num);
    Collections.shuffle(num);
    System.out.println("After Shuffling the list : "+num);
    Collections.reverse(num);
    System.out.println("After reverseof a ArrayList : "+num);
    System.out.println("Before Swapping List : "+num);
    Collections.swap(num,0,3);
    System.out.println("After Swapping List : "+num);
    List<Integer> sublist=num.subList(2, 5);
    System.out.println("Sub list is : "+sublist);
    sublist.clear();
    System.out.println("SubList after clear Method : "+sublist);
    System.out.println(sublist.isEmpty());
    ArrayList<Integer> num1=(ArrayList)num.clone();
    System.out.println(num1);
    
}
}
