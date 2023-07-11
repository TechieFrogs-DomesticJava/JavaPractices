public class CircularLinkedListDemo {
  Node head,tail;
    class Node{
      int data;
      Node next;
      Node tail;
      Node(int data){
        this.data=data;
      }
    }
    void insertElements(int data){
      Node newNode=new Node(data);
      if(head==null){
        head=newNode;
        tail=newNode;
        tail.next=newNode;
      }
      else{
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
      
      }
      
    }
    void displayElements(){
      Node n1=head;
      if(tail==null && head==null){
        System.out.println("Circular LL is empty,nothing to display");
      }
      else{
        do{
          System.out.println(n1.data);
          n1=n1.next;
        }while(n1!=head);
      }
    }
    void deleteElements(){
      if(tail!=head){
        head=head.next;
        tail.next=head;
      }
      else{
        head=tail=null;
      }
    }
  public static void main(String[] args) {
    CircularLinkedListDemo d1=new CircularLinkedListDemo();
    d1.insertElements(2);
    d1.insertElements(7);
    d1.insertElements(8);
    d1.displayElements();
    d1.deleteElements();
  }
}
