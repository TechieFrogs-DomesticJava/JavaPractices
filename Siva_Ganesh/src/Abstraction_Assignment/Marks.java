package Abstraction_Assignment;
/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
by student A and in four subjects (each out of 100) by student B. Create an abstract class
 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B'
  each having a method with the same name which returns the percentage of the students. 
  The constructor of student A takes the marks in three subjects as its parameters 
  and the marks in four subjects as its parameters for student B. Create an object for each 
  of the two classes and print the percentage of marks for both the students. */
abstract public class Marks {
  int subject1;
  int subject2;
  int subject3;
  int subject4;
  abstract public float getPercentage();
}
class ClassA extends Marks{
  ClassA(int s1,int s2,int s3){
      this.subject1=s1;
      this.subject2=s2;
      this.subject3=s3;
  }
  @Override
  public float getPercentage() {
    float f1=(subject1+subject2+subject3);
    float var1=(f1/300)*100;
    return var1;
  }
  
}
class ClassB extends Marks{
    ClassB(int s1,int s2,int s3,int s4){
      this.subject1=s1;
      this.subject2=s2;
      this.subject3=s3;
      this.subject4=s4;
    }
  @Override
  public float getPercentage() {
    float v1=(subject1+subject2+subject3+subject4);
    float var2=(v1/400)*100;
    return var2;
  }
  public static void main(String[] args) {
    ClassA a1=new ClassA(47, 54, 83);
    ClassB b1=new ClassB(91, 81, 56, 47);
    System.out.println("ClassA Person Percentage1 is : "+a1.getPercentage());
    System.out.println("ClassB Person Percentage2 is : "+b1.getPercentage());
  }
}
