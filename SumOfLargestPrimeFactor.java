
// Given a positive integer n as an input. Your task is to find the sum of the largest prime factor of each number less than or equal to n.

// For example,  

// Input : 10

// Output : 32

// Explanation:  The sum of the largest prime factors of (2,3,4,5,6,7,8,9,10) is 2+3+2+5+3+7+2+3+5= 32.


import java.util.*;
public class SumOfLargestPrimeFactor
{
    public static int sumOfLargestPrimeFactor (int num)
    {
        int arr[] = new int[num + 1];
        int sum = 0;
        int max = num / 2;
        
        for (int i = 2; i <= max; i++)
        {
        	if (arr[i] == 0)
	        {
        	    for (int j = i * 1; j <= num; j += i)
	                arr[j] = i;
	        }
        }
    
        for (int i = 2; i <= num; i++)
        {
        	if (arr[i] != 0)
	            sum += arr[i];
	        else
	            sum += i;
        }
        return sum;
  }
  public static void main (String[]args)
  {
    System.out.println (sumOfLargestPrimeFactor (10));
  }
}
