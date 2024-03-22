// Ask for a number from the user for which he wants to print a table for. 
// The message should be “Please enter the number for which you want to print the table” . 
// Store that number in a variable n, create a method printTheTable, for calculating and printing the table for n. 
// Use Scanner method for accepting the input frm the user.


import java.util.Scanner;
 
public class UserInputChallenge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print : ");
        int number = sc.nextInt();
        printTheTable(number);
    }
 
    public static void printTheTable(int n) {
        int calc;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}