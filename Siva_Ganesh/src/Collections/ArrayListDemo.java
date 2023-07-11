package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList arrlist1=new ArrayList();
    arrlist1.add("123");
    arrlist1.add(123);
    arrlist1.add('c');
    for (Object object : arrlist1) {
      System.out.println(object);
    }
    // Iterator iter=arrlist1.iterator();
    // while(iter.hasNext()){
    //   System.out.println(iter.next());
    // }
ArrayList<Integer> aList=new ArrayList<Integer>();
aList.add(12);
aList.add(22);
aList.add(21);
aList.add(34);
ArrayList<Integer> aList3=new ArrayList<Integer>();
aList3.add(34);
aList3.add(56);
aList3.add(73);
aList3.clear();
System.out.println("After clear method : "+aList3);
System.out.println("REsult : "+aList.addAll(3, aList3));
aList.addAll(3, aList3);
Collections.sort(aList);
System.out.println("with out using an iterator : "+aList);
Iterator iter1=aList.iterator();
while(iter1.hasNext()){
  System.out.println(iter1.next());
}
ArrayList<String> arr2=new ArrayList<String>();
arr2.add("Raju");
arr2.add("somu");
arr2.add("Raju");
ListIterator<String> list1=arr2.listIterator(arr2.size());
while(list1.hasPrevious()){
  String str=list1.previous();
  //Here element iterates in reverse order by using ListIterator : "
  System.out.println(str);
}
ArrayList<Integer> str1=new ArrayList<>();
  }
}
