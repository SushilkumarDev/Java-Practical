// Constructor.java

package com.company;

public class Constructor {

    public static void main(String[] args) {

        GrocMarket myAccount = new GrocMarket("Manish", "#1256", "98356", 100, "USA");

        System.out.println(myAccount.getAccBal());
        System.out.println(myAccount.getCustPhNo());

        GrocMarket newAcc = new GrocMarket("NewCust", "#121212", "1212121");
        System.out.println(newAcc.getCustName());
        System.out.println(newAcc.getAccBal());
    }
}

// GrocMarket.java

package com.company;

public class GrocMarket {
    private String custName;
    private String custID;
    private String custPhNo;
    private double accBal;
    private String address;
    private final double RECBaN = 100;

    public GrocMarket(String custName, String custID, String custPhNo, double accBal, String address) {
        this.custName = custName;
        this.custID = custID;
        this.custPhNo = custPhNo;
        this.accBal = accBal;
        this.address = address;
        System.out.println("Constructor Called");
    }

    public GrocMarket(String custName, String custID, String custPhNo) {
        this(custName, custID, custPhNo, 200, "Sydney");
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustPhNo() {
        return custPhNo;
    }

    public void setCustPhNo(String custPhNo) {
        this.custPhNo = custPhNo;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Shop(double amount) {

        if (accBal >= amount) {
            double remBal = accBal - amount;
            System.out.println("Thanks for Shopping. Your balance amount is: " + remBal);
            accBal = remBal;

        } else {
            double lowAmount = amount - RECBaN;
            System.out.println("Insufficient Amount: Add more money: " + lowAmount);
        }
    }

    public void rechargeAcc(double recharge) {
        accBal += recharge;
        System.out.println("Thanks for recharging. Your new balance is: " + accBal);
    }
}
