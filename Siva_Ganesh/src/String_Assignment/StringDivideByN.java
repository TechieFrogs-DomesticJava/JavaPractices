package String_Assignment;

public class StringDivideByN {

    // Method to print n equal parts of str
    static void divideString(String str, int n)
    {
        int str_size = str.length();
        int part_size;
 
        // Check if string can be divided in
        // n equal parts
        if (str_size % n != 0) {
            System.out.println("Invalid Input: String size"+ "is not divisible by n");
            return;
        }
 
        // Calculate the size of parts to find
        // the division points
        part_size = str_size / n;
 
        for (int i = 0; i < str_size; i++) {
            if (i % part_size == 0)
                System.out.println();
            System.out.print(str.charAt(i));
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // length of string is 28
        String str = "Hello_Every_One ";
 
        // Print 4 equal parts of the string
        divideString(str, 4);
    }
}

