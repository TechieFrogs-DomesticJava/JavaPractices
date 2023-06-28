public class CloneImplementDemo implements Cloneable{  
    int rollno;  
    String name;  
      
    CloneImplementDemo(int rollno,String name){  
    this.rollno=rollno;  
    this.name=name;  
    }  
      
    public Object clone()throws CloneNotSupportedException{  
    return super.clone();  
    }  
      
    public static void main(String args[]){  
    try{  
    CloneImplementDemo s1=new CloneImplementDemo(101,"amit");  
      
    CloneImplementDemo s2=(CloneImplementDemo)s1.clone();  
      
    System.out.println(s1.rollno+" "+s1.name);  
    System.out.println(s2.rollno+" "+s2.name);  
      
    }catch(CloneNotSupportedException c){}  
      
    }  
    }  