package MultiThreading_practice;


    class Table{  
    void printTable(int n){//method not synchronized  
       for(int i=1;i<=5;i++){  
         System.out.println(n*i);  
         try{  
          Thread.sleep(400);  
         }catch(Exception e){System.out.println(e);}  
       }  
      
     }  
    }  
      
    class MyThread01 extends Thread{  
    Table t;  
    MyThread01(Table t){  
    this.t=t;  
    }  
    public void run(){  
    t.printTable(5);  
    }  
      
    }  
    class MyThread02 extends Thread{  
    Table t;  
    MyThread02(Table t){  
    this.t=t;  
    }  
    public void run(){  
    t.printTable(100);  
    }  
    }  
      
   public  class SynchronizationDemo1{  
    public static void main(String args[]){  
    Table obj = new Table();//only one object  
    MyThread01 t1=new MyThread01(obj);  
    MyThread02 t2=new MyThread02(obj);  
    t1.start();  
    t2.start();  
    }  
    }  
