
// Declare a variable n which will store the digit, whose table we need to print. Declare two more variables i and table.  I will be our iterator, and table will store the calculated output. Which we need to print.

public class WhileLoopChallenge
{
    public static void main (String args[])
    {
        int n = 5, i = 1, table;
        while (i <= 10)
        {
        	table = n * i;
	        System.out.println (n + " x " + i + " = " + table);
	        i++;
        }
    }
}