import java.io.*;
public class BufferReaderDemo {
  public static void main(String[] args) throws Exception {
    InputStreamReader r=new InputStreamReader(System.in);  
    BufferedReader br=new BufferedReader(r);  
      
    System.out.println("Enter your name :");  
    String name=br.readLine();  
    System.out.print("Welcome "+name);  
     }  
    }  