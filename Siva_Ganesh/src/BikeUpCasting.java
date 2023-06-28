public class BikeUpCasting {
  
  
      void run(){System.out.println("running");}  
    }  
    class Splendor extends BikeUpCasting{  
      void run(){System.out.println("running safely with 60km");}  
      
      public static void main(String args[]){  
        BikeUpCasting b = new Splendor();//upcasting  
        b.run();  
      }  
    }  