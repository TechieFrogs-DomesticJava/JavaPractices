package Inheritance_Assignment;
/*Consider a superclass PurchaseItem which models customer’s purchases. This class has:
•	two private instance variables name (String) and unitPrice (double).
•	One constructor to initialize the instance variables.
•	A method getPrice that returns the unitPrice.
•	Accessor and mutator methods.

Consider two subclasses WeighedItem and CountedItem. 
WeighedItem has an additional instance variable weight (double) in Kg while CountedItem has an additional variable quantity (int) both private.
- Write an appropriate constructor for each of the classes making use of the constructor of the superclass in defining those of the subclasses. 
- Override getPrice method that returns the price of the purchasedItem based on its unit price and weight (WeighedItem), or quantity (CountedItem).  Make use of getPrice of the superclass
Write an application class Challenge where you construct objects from the two subclasses and print them on the screen.
 */
public class PurchaseItem
{
private String name;
private double unitPrice;
public PurchaseItem() {
this.name = "No Item";
this.unitPrice = 0;
}
public PurchaseItem(String name, double unitPrice) {
this.name = name;
this.unitPrice = unitPrice;
}
public void getData() {
System.out.println("Name :- "+name);
System.out.println("Unit Price :- "+unitPrice);
}
public void setData(String name, double unitprice) {
this.name = name;
this.unitPrice=unitprice;
}
public double getPrice(){
return unitPrice;
}

public String toString() {
return "Name is "+name + " and  " + "unit price is "+unitPrice ;
}
}
class WeighedItem extends PurchaseItem
{
private double weight;
public WeighedItem() {
}
public WeighedItem(double weight) {
this.weight = weight;
}
public double getWeight() {
return weight;
}

public void setWeight(double weight) {
this.weight = weight;
}

public double getPrice()
{
return weight*super.getPrice();
}
public String toString() {

return super.toString()+" "+weight+" kg "+getPrice()+" RS";
}
}
class CountedItem extends PurchaseItem
{
private int quantity;
public CountedItem() {
}
public CountedItem(int quantity) {
this.quantity = quantity;
}
public int getQuantity() {
return quantity;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

public double getPrice()
{
return quantity*super.getPrice();
}

public String toString() {
return super.toString()+" "+quantity+" units "+getPrice()+" RS";
}
}

    

class Challenge{
  public static void main(String[] args) {
    WeighedItem w = new WeighedItem();
    w.setData("Banana"  , 1.37);  
    w.setWeight(4.11);
    System.out.println(" "+w.toString());
    
    CountedItem c = new CountedItem();
    c.setData("Pen", 4.5);
    c.setQuantity(10);
    System.out.println(" "+c.toString());
    
    }
    
    }