class Age{
   static String eligibility="";
  public static void main(String[] args) {
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