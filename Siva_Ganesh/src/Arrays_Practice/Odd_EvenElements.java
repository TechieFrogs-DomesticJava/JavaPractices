package Arrays_Practice;

public class Odd_EvenElements {
  public static void main(String args[]){  
    int a[]={11,22,57,66,34,28};  
    System.out.println("Odd Numbers:");  
    for(int i=0;i<a.length;i++){  
    if(a[i]%2!=0){  
    System.out.println(a[i]);  
    }  
    }  
    System.out.println("Even Numbers:");  
    for(int i=0;i<a.length;i++){  
    if(a[i]%2==0){  
    System.out.println(a[i]);  
    }  
    }  
    }
  }  
