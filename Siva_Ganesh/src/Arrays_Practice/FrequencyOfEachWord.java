package Arrays_Practice;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
      int arr[] = {8,7,3,4,5,4,1,2,1,7,8,4};
        int fr[]=new int[arr.length];
        int visited=-1;
        
       
          for(int i = 0; i < arr.length; i++) {
            int count= 1;
            for(int j=i+1;j<arr.length;j++){
              if(arr[i] == arr[j]) {
                count++;
                //To Avoid COunting the same element
                fr[j]=visited;
              }
            }
            if(fr[i]!=visited){
              fr[i]=count;
            }
            
        
      }
      System.out.println(" Element | Frequency");  
      System.out.println("---------------------------------------");  
      for(int i = 0; i < fr.length; i++){  
          if(fr[i] != visited)  
              System.out.println("    " + arr[i] + "    |    " + fr[i]);  
      }  
        ;
    }
}

