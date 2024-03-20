
// (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month.
// For example, if the user entered month 2 and year 2012, the program should display that February 2012 has 29 days. 
//If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.  


import java.util.*;
class NumberOfDaysInMonth
{
    public static boolean isLeapYear (int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 != 0))
            return true;
        else
            return false;
    }
    
    public static void getDaysInMonths (int month, int year)
    {
        if (month < 1 || month > 12)
        {
        	System.out.println ("-1");
	        return;
        }
        if (year < 1 || year > 9999)
        {
        	System.out.println ("-1");
	        return;
        }
        switch (month)
        {
            case 1:
	            System.out.println ("January " + year + " has 31 days");
	            break;
            case 2:
	            System.out.println ("February " + year + " has " +(isLeapYear (year) ? " 29 days" : " 28 days"));
	            break;
            case 3:
	            System.out.println ("March " + year + " has 31 days");
	            break;
            case 4:
	            System.out.println ("April " + year + " has 30 days");
	            break;
            case 5:
	            System.out.println ("May " + year + " has 31 days");
	            break;
            case 6:
	            System.out.println ("June " + year + " has 30 days");
	            break;
            case 7:
	            System.out.println ("July " + year + " has 31 days");
	            break;
            case 8:
	            System.out.println ("August " + year + " has 31 days");
	            break;
            case 9:
	            System.out.println ("September " + year + " has 30 days");
	            break;
            case 10:
	            System.out.println ("October " + year + " has 31 days");
	            break;
            case 11:
	            System.out.println ("November " + year + " has 30 days");
	            break;
            case 12:
	            System.out.println ("December " + year + " has 31 days");
        }
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Month");
        int month = sc.nextInt ();
        System.out.println ("Enter Year");
        int year = sc.nextInt ();
        getDaysInMonths (month, year);
    }
}