import java.util.Arrays;
import java.util.LinkedList;

public class ConvertLinkedListToArray {
  public static <T> Object[] convertLinkedListToArray(LinkedList<T> linkedList)
    {
 
        // Converting LinkedList to Array
        Object[] array = linkedList.toArray();
 
        return array;
    }
 
  public static void main(String[] args) {
     LinkedList<String>
            linkedList = new LinkedList<String>();
      linkedList.add("Orange");
      linkedList.add("Grapes");
      linkedList.add("Mango");
      linkedList.addFirst("Gova");
      linkedList.addLast("Apple");
      // Converting LinkedList to Object Array
        Object[] objArray = convertLinkedListToArray(linkedList);
 
        // Convert Object[] to String[]
        String[] array = Arrays.copyOf(objArray,
                                    objArray.length,
                                    String[].class);
        // Print the String Array
        System.out.println("Array: "+ Arrays.toString(array));
  }
}
