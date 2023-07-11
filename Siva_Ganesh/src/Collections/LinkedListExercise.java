import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExercise {
  public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();
    list.add(19);
    list.add(98);
    list.add(56);
    list.add(66);
    //Adding element last of the linked list
    list.addLast(119);
    // Insert elements From the last Position
    list.addFirst(243);
    // Insert the element at specified position
    list.add(3, 75);
    // Remove Element from a linked List
    list.remove(6);
    // Get the element of first and last element of a linked list
    System.out.println("First element : "+list.getFirst()+" "+"Last element : "+list.getLast());
    // Swap Elements in a Linked List
    
    System.out.println("After Swapping the list : ");
    for (Integer integer : list) {
      System.out.println(integer);
    }
    
    LinkedList<Integer> Copylist=(LinkedList)list.clone();
    // Contains method checks  the element is present in the list or not
    System.out.println("Checks the Element present in the list or not : "+list.contains(56)); 
    // Retrives the Last element of a List but it not remove the element
    System.out.println("peeklast() method retrives the last element : "+Copylist.peekLast());
    // Retrives the first element but it not remove the element 
    System.out.println("peek retrives the first element : "+Copylist.peek());
    //Retrives the first element and remove the element
    System.out.println("Retrive the first element and removes the One : "+Copylist.poll());
    for (Integer cpylist : Copylist) {
      System.out.println(cpylist);
    }
    Copylist.removeAll(Copylist);

    System.out.println("After removing elements : "+Copylist);
    Iterator<Integer> it=list.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    //iterator a list in reverse Order
    Collections.reverse(list);
    Iterator<Integer> it3=list.iterator();
    System.out.println("Reverse of a Linked List : ");
    int position=0;
    while(it3.hasNext()){
      System.out.println("Element is : "+it3.next()+"  "+"  Element Position : "+position);
      position++;
    }
    System.out.println();
    
    //using the Iterator using the Specified index
    System.out.println("Iteration start from a Specified Index : ");
    Iterator<Integer> it1=list.listIterator(2);
    while(it1.hasNext()){
      System.out.println(it1.next());
    }
  }
}
