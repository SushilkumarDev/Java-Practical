
//Write a program to accept three number and check whether they are pythagorean triplet or not.    



import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        CalculatePythagoreanTriplets(a, b, c);
    }
 
    public static void CalculatePythagoreanTriplets(int a, int b, int c) {
        int p = a * a;
        int q = b * b;
        int r = c * c;
        if ((p + q) == r) {
            System.out.println(a + " " + b + " and " + c + " are Pythagorean Triplets");
        } else {
            System.out.println(a + " " + b + " and " + c + " are not Pythagorean Triplets");
 
        }
    }
 
}