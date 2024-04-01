
// A complex number is a number that can be expressed in the form a+bi, where a and b are real numbers, and i is a solution of equation x2=-1.  

// Write a program to Add and subtract  two complex numbers by creating a class Complex number in which :  

// The complex numbers will be initialized with the help of the constructor.
// The addition and subtraction will be performed with the help of function calling.
//   Example :

// Input : a1= 4 b1=8 a2=5 b2=7  

// Output : Sum = 9+ i15 Difference = -1+i  

// Explanation:

// (4 + i8) + (5 + i7)

// = (4 + 5) + i(8 + 7)

// = 9 + i15 (4 + i8) - (5 + i7)

// = (4 - 5) + i(8 - 7)

// = -1 + i

import java.util.*;
class Complex {

    int real, imaginary;

    Complex()
    {
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
        System.out.println("Complex number: "+ real + " + "+ imaginary + "i");
    }
}

public class Main{

    public static void main(String[] args)
    {

        Complex C1 = new Complex(4, 8);

        C1.printComplexNumber();

        Complex C2 = new Complex(5, 7);

        C2.printComplexNumber();

        Complex C3 = new Complex();

        C3 = C3.addComp(C1, C2);

        System.out.print("Sum of ");
        C3.printComplexNumber();

        C3 = C3.subtractComp(C1, C2);

        System.out.print("Difference of ");
        C3.printComplexNumber();
    }
}