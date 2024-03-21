
// Write a method named getOddDigitSum with one parameter of type int called number.  

// The method should return the sum of the odd digits within the number.  

// If the number is negative, the method should return -1 to indicate an invalid value.

//   EXAMPLE INPUT/OUTPUT:  

// getOddDigitSum(123456789); → should return 25 since 1 + 3 + 5 + 7 +9 = 25
// getEvenDigitSum(252); → should return 5 since 5 is the only odd digit in the number
// getEvenDigitSum(-22); → should return -1 since the number is negative.
 

public class OddDigitSum
{
    public static int oddDigitSum (int num)
    {
        if (num < 0)
          return -1;
        int sum = 0;
    
        while (num != 0)
        {
        	if ((num % 10) % 2 != 0)
	            sum += num % 10;
	        num = num / 10;
        }
        return sum;
    }
  
    public static void main (String[]args)
    {
        System.out.println (oddDigitSum (123456789));
        System.out.println (oddDigitSum (252));
        System.out.println (oddDigitSum (-7));
    }
}