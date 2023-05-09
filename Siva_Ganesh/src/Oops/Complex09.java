package Oops;
  import java.util.*;
class Complex {
    int real, imaginary;
    Complex(){
    }
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }
    Complex addComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }
    Complex subtractComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }
    void printComplexNumber()
    {
        System.out.println("Complex number: " + real + " + "+ imaginary + "i");
    }
}
public class Complex09 extends Complex { 
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        int i,j,k,l;
        System.out.print("Enter real  value of i : ");
        i=sc1.nextInt();
        System.out.print("Enter real  value of j : ");
        j=sc1.nextInt();
        System.out.print("Enter real  value of k : ");
        k=sc1.nextInt();
        System.out.print("Enter real  value of l: ");
        l=sc1.nextInt();
        Complex C1 = new Complex(i, j);
        C1.printComplexNumber();
        Complex C2 = new Complex(k, l);
        C2.printComplexNumber();
         Complex C3 = new Complex();
        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();
        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
        sc1.close();
    }
}

