class Age{
   static String eligibility="";
   public static void display(){
    System.out.println("first static method");
   }
   public static void display(int a,int b){
    System.out.println("The value are : a="+a+" & " +"b="+b );

   }
  public static void main(String[] args) {
    Age.display(2, 6);
    Age.display();
    int age=18;
    
    if(age>=18){
      eligibility="you are eligible to vote";
    }
    System.out.println(eligibility);
    Printeligibility();
  }
  public static void Printeligibility(){
    //String eligibility="yes";
    System.out.println(eligibility);
  }
}