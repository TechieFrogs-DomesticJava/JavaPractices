package Interface_practice;
/*Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 Make Employee implement Measurable. Provide a method double average(Measurable[] objects) that 
 computes the average measure */
public interface Measurable {
  double getMeasure();
}
class Employee implements Measurable{

  @Override
  public double getMeasure() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMeasure'");
  }
  
}
