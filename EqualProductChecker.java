
// Write a method hasEqualProduct with 3 parameters of type int.

// The method should return boolean and it needs to return true if the product of the first and second parameter is equal to the third parameter. Otherwise, return false.  

// Example 

// Input :

// 2 3 6

// Output :

// True  

// Explanation:

// Since 2*3 is equal to 6, hence return true.





import java.util.Scanner;
public class EqualProductChecker
{
    public static boolean equalProductChecker (int num1, int num2, int num3)
    {
        if (num1 * num2 == num3)
            return true;
        else
        return false;
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt ();
        int num2 = sc.nextInt ();
        int num3 = sc.nextInt ();
        boolean res = equalProductChecker (num1, num2, num3);
        System.out.println (res);
    }
}