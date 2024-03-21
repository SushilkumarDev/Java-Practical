
// Declare a variable n and store a number in it. Declare two more variables rem and sum. Your task is to calculate the sum of the digits of the number, rem will be used for storing the digits, and sum will be used to store the sum of those digits.

// For example

// N = 12345

// Sum of digits will be = 15


public class DoWhileLoopChallenge
{
    public static void main (String args[])
    {
        int n = 12345, rem, sum = 0;
        do
        {
        	rem = n % 10;
	        sum += rem;
	        n = n / 10;
        }while (n != 0);
        System.out.println ("The sum of digits is : " + sum);
    }
}
