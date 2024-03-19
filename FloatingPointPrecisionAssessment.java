
//Calculate the quantity of petrol and diesel in a budget of 1546.12 Rs according to respective prices 84.11, 74.91

public class FloatingPointPrecisionAssessment
{
    public static void main (String args[])
    {
        float petrol_quantity, diesel_quantity;
        Double petrol_quantity1, diesel_quantity1;
        float petrol_prices = 74.91f;
        float diesel_prices = 84.11f;
        float wallet_balance = 1546.12f;
        petrol_quantity = wallet_balance / petrol_prices;
        diesel_quantity = wallet_balance / diesel_prices;
        Double petrol_prices1 = 74.91;
        Double diesel_prices1 = 84.11;
        Double wallet_balance1 = 1546.12;
        petrol_quantity1 = wallet_balance1 / petrol_prices1;
        diesel_quantity1 = wallet_balance1 / diesel_prices1;

        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + petrol_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + diesel_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + petrol_quantity1);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + diesel_quantity1);
    } 
}
