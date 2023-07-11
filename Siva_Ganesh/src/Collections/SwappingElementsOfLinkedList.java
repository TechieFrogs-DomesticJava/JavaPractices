import java.util.LinkedList;

public class SwappingElementsOfLinkedList {
  public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();
    list.add(19);
    list.add(98);
    list.add(56);
    list.add(66);
    int element1=19;
    int element2=56;
    System.out.println("Before swapping the Linked list : ");
    for (Integer l1 : list) {
      System.out.println(l1);
    }
    swap(list,element1,element2);
    System.out.println("After Swapping the Linked List : ");
    for (Integer l2 : list) {
      System.out.println(l2);
    }
  }
  public static void swap(LinkedList<Integer> list,
                            int ele1, int ele2)
    {
  
        // Getting the positions of the elements
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
  
        // Returning if the element is not present in the
        // LinkedList
        if (index1 == -1 || index2 == -1) {
            return;
        }
  
        // Swapping the elements
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
}
