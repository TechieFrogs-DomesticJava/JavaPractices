package Interface_practice;
/*Provide an interface Measurable with a method double getMeasure() that measures an 
object in some way.Make Employee implement Measurable. Provide a method double 
average(Measurable[] objects) that computes the average measure.
Use it to compute the average salary of an array of employees*/
public interface Measurable {
  double getMeasure();
}
class Employee implements Measurable{
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  @Override
  public double getMeasure() {
    return salary;
  }
}
class Main {
  public static void main(String args[]) {
    
    Employee[] people = new Employee[4];
      people[0] = new Employee("Kiran", 65000);
      people[1] = new Employee("Somu", 45000);
      people[2] = new Employee("Ramesh", 55000);
      people[3] = new Employee("Suresh", 40000);
      double averageSalary = average(people);
      System.out.println("Average salary is :"+averageSalary);
  }

  public static double average(Employee[] objects)
  {
      if (objects.length == 0) { return 0; }
      double sum = 0;
      for (Employee obj : objects)
      {
          double measure = obj.getMeasure();
          sum = sum + measure;
      }
      double result = sum / objects.length;
      return result;
  }
}



