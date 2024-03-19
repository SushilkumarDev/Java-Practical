
// Write a method printYearsAndDays with parameter of type long named minutes.  

// The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.  

// If the parameter is less than 0, print text "Invalid Value".   Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

// XX represents the original value minutes.

// YY represents the calculated years.

// ZZ represents the calculated days.  

// EXAMPLES OF INPUT/OUTPUT:  

// printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
// printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
// printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
//   TIPS:  

//  Use the remainder operator
//  1 hour = 60 minutes
//  1 day = 24 hours
//  1 year = 365 days
 



public class MinutesToYearsDaysCalculator
{
    public static void printYearsAndDays (long minutes)
    {
        if (minutes < 0)
        {
    	    System.out.println ("Invalid Value");
        }
        else
        {
        	long years = minutes / 525600;
	        long minutesRemaining = (minutes - (years * 525600));
	        long daysRemaining = minutesRemaining / 1440;
    	        System.out.println (minutes + " min = " + years + " y and " +daysRemaining + " d");
        }
    }
    
    public static void main (String[]args)
    {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}