public class DisplayCharatersFromA_Z {
  public static void main(String[] args) {
   char ch=65;
   System.out.print("Upper case Letters are: ");
    for(int i=0;i<26;i++){
      System.out.print(ch+" ");
      ch++;
    }
    System.out.println(" ");
    char ch1=97;
    System.out.print("Lower case Letters are : ");
    for(int j=0;j<26;j++){
      System.out.print(ch1+" ");
      ch1++;

    }
  }
}
