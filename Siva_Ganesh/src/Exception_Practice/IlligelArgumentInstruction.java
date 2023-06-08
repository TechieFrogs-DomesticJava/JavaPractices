package Exception_Practice;

public class IlligelArgumentInstruction {
 
    int m;
    public void setMarks(int marks) {
       if(marks < 0 || marks > 100)
          throw new IllegalArgumentException(Integer.toString(marks));
       else
          m = marks;
    }
    public static void main(String[] args) {
      try{
      IlligelArgumentInstruction s1 = new IlligelArgumentInstruction();
       s1.setMarks(45);
       System.out.println(s1.m);
       IlligelArgumentInstruction s2 = new IlligelArgumentInstruction();
       s2.setMarks(101);
       System.out.println(s2.m);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
 }

