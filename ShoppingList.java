package com.company;

public class ShoppingList {

    public static String list(int item_code)
    {
        String item_name=" ";
        switch(item_code)
        {
            case 1 :
                item_name = "Fruits";
                System.out.println("Item name is " + item_name);
               return item_name;
            case 2:
                item_name = "Vegetables";
                System.out.println("Item name is " + item_name);
                return item_name;
            case 3:item_name = "Drinks";
                System.out.println("Item name is " + item_name);
                return item_name;

            case 4:
                item_name = "Spices";
                System.out.println("Item name is " + item_name);
               return item_name;

            case 5:
                item_name = "Oils";
                System.out.println("Item name is " + item_name);
                return item_name;

            default:
                System.out.println("Wrong item selected");
                break;
        }
        return item_name;
    }


}

package com.company;

public class ShoppingCart extends ShoppingList{

    public static double price(String item_name)
    {
        double price = 0;
        if(item_name == "Fruits")
        {
            price = 40.25;
        }
        else if(item_name == "Vegetables")
        {
            price = 62.25;
        }
        else if(item_name == "Drinks")
        {
            price = 45.26;
        }
        else if(item_name == "Spices")
        {
            price = 63.29;
        }
        else if(item_name == "Oils")
        {
            price = 75.50;
        }
        return price;
    }

}


package com.company;
import java.util.Scanner;
public class Wallet extends ShoppingCart {
    double wallet_balance = 25.00;

    public static void balance()
        {
            double balance = 0.0;
            System.out.println("Your current wallet balance is " + balance);
        }
        public void recharge(double amount)
        {
            wallet_balance = wallet_balance+amount;
            System.out.println("Thanks for recharging");
            System.out.println("Your new balance is " + wallet_balance);
        }
        public void updateBalance( double item_price)
        {
            wallet_balance = wallet_balance - item_price;
            System.out.println("Your updated wallet balance is " + wallet_balance );
        }
        public void bill(double item_price)
        {
            if (item_price<wallet_balance)
            {
                System.out.println("Thanks for purchasing");
                updateBalance(item_price);
            }
            else if(item_price>wallet_balance)
            {
                System.out.println("Low Balance !!");
                double recharge_amt = item_price - wallet_balance;
                System.out.println("Please recharge your wallet with " + recharge_amt);
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the amount you want to recharge your wallet with ");
                double amount = sc.nextDouble();
                recharge(amount);
            }
        }
    }

package com.company;
import java.util.Scanner;

public class Inheritance {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the product");
        System.out.println("-------------------------");
        System.out.println("Press 1 for fruits");
        System.out.println("Press 2 for Vegetables");
        System.out.println("Press 3 for Drinks");
        System.out.println("Press 4 for Spices");
        System.out.println("Press 5 for Oils");
        System.out.println("Please select an item from the above list");
        int item_code = sc.nextInt();
        Wallet obj = new Wallet();
        String item_name =  obj.list(item_code);
        double price = obj.price(item_name);
        obj.bill(price);
    }

}