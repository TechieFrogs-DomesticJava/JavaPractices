package Exception_Practice;
import java.util.ArrayList;
public class ArrayIndexOutOfBoundException {
    public static void main(String[] args)
    {
        ArrayList<String> lis = new ArrayList<>();
        lis.add("My");
        lis.add("Name");
        System.out.println(lis.get(2));
    }
}

