package String_Assignment;

public class CapitaliseEachWordInaString {
  public static void main(String[] args) {
    String str="hello Good morning everyone";
    Boolean foundSpace=true;
    
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++){
      if(Character.isLetter(ch[i])){
        if(foundSpace){
          ch[i]=Character.toUpperCase(ch[i]);
          foundSpace=false;
        }
      }
      else{
        foundSpace=true;
      }
    }
    str=String.valueOf(ch);
    System.out.println(str);
  }
}
