package Collections;

import java.util.ArrayList;
import java.util.Iterator;



// Create a new array list, add some colors (String) and print out the collection.
public class ArrayListExercies1 {
  public static void main(String[] args) {
    ArrayList<String> arr1=new ArrayList<String>();
    arr1.add("Blue");
    arr1.add("red");
    arr1.add("Yellow");
    arr1.add("pink");
    Iterator<String> itr1=arr1.iterator();
    while(itr1.hasNext()){
      String color=itr1.next();
      System.out.println("Color is : "+color);
    }
    for(int i=0;i<arr1.size();i++){
      System.out.println("Access elements using array : "+arr1.get(i));
      
    }
  }
}
