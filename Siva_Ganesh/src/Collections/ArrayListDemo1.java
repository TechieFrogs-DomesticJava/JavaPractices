package Collections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo1 {
  int id;
  String name;
  public ArrayListDemo1(int id,String name){
    this.id=id;
    this.name=name;
  }
  public static void main(String[] args) {
    ArrayListDemo1 a1=new ArrayListDemo1(101, "Siva");
    ArrayListDemo1 a2=new ArrayListDemo1(102, "Ganesh");
    List<ArrayListDemo1> mylist=new ArrayList<>();
    mylist.add(a1);
    mylist.add(a2);
    Iterator<ArrayListDemo1> itr=mylist.iterator();
    while(itr.hasNext()){
      ArrayListDemo1 d1= itr.next();
      System.out.println("Id is : "+d1.id+" "+"Name is :"+d1.name);
      
    }

  }
}
