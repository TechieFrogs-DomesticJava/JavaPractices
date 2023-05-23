package String_Assignment;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CountPunctuation {
  


    public static void main(String[] args) {
        String s="This is Awsome! to Hear From you.";
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
            
            if(s.charAt(i)=='!' || s.charAt(i)=='.' || s.charAt(i)=='?'){
                
                count++;
        }
    }
    System.out.println(count);
}
}

