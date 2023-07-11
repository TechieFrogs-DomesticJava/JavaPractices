public class QueueDemo {
  int front_Q,rear_Q;
  int capacityOfQueue;
  static int[] q1;

  QueueDemo(int size){
    capacityOfQueue=size;
    q1=new int[capacityOfQueue];
  }
  void enque(int value){
    if(rear_Q==capacityOfQueue){
      System.out.println("Queue is Already full,you cannont insert value ");
    }
    else{
      q1[rear_Q]=value;
      rear_Q++;
    }
  }
  void dequeue(){
    if(rear_Q==0){
      System.out.println("There is nothing to delete");
    }
    else {
      for(int i=0;i<rear_Q-1;rear_Q++){
        q1[i]=q1[i+1];
      }
      rear_Q--;
    }
  }
  void display(){
    if(rear_Q==-1){
      System.out.println("There is nothing in the Queue, to Display");

    }
    else{
      for(int i=0;i<rear_Q;i++){
        System.out.print(q1[i]+ " ");
      }
    }
  }

}
class QueueSolution{
  public static void main(String[] args) {
    QueueDemo d1=new QueueDemo(5);
     d1.enque(3);
     d1.enque(6);
     d1.enque(8);;
     d1.enque(4);
   
    System.out.println();
    
    
    d1.display();
  }
}

