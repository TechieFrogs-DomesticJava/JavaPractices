 class Address {  
String city,state,country;  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  
public class EmpDemo {
    int id;  
    String name;  
    Address address;  
      
    public EmpDemo(int id, String name,Address address) {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  
      
    void display(){  
    System.out.println(id+" "+name);  
    System.out.println(address.city+" "+address.state+" "+address.country);  
    }  
      
    public static void main(String[] args) {  
    Address address1=new Address("gzb","UP","india");  
    Address address2=new Address("gno","UP","india");  
      
    EmpDemo e=new EmpDemo(111,"varun",address1);  
    EmpDemo e2=new EmpDemo(112,"arun",address2);  
          
    e.display();  
    e2.display();  
          
    }  
    }  