public class DecimalComparator
{
    public static boolean areEqualByFiveDecimalPlaces (double num1, double num2,double num3)
    {
        num1 = Math.round (num1 * 100000);
        num2 = Math.round (num2 * 100000);
        num3 = Math.round (num3 * 100000);
        return (num1 == num2) && (num2 == num3);
    }
    
    public static void main (String[]args)
    {
        System.out.println (areEqualByFiveDecimalPlaces (1.176231, 1.176232, 1.176233));
        System.out.println (areEqualByFiveDecimalPlaces (2.23543, 2.235432, 2.235451));
    }
}
