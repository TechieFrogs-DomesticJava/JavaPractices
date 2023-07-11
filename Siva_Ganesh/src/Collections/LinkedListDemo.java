import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> lnk=new LinkedList<String>();
    lnk.add("Orange");
    lnk.add("Grapes");
    lnk.add("Mango");
    lnk.addFirst("Gova");
    lnk.addLast("Apple");
    Collections.sort(lnk);
    Iterator<String> it= lnk.iterator();
    while(it.hasNext()){
    
      System.out.println(it.next());
    }
    Iterator<String> rev=lnk.descendingIterator();
    System.out.println("Reverse of Linked List : ");
    while(rev.hasNext()){
          System.out.println(rev.next());

    }
    System.out.println(lnk.poll());
    
    Iterator<String> it1= lnk.iterator();
    while(it1.hasNext()){
    
      System.out.println(it1.next()+" ");
    }
    
  }
}
