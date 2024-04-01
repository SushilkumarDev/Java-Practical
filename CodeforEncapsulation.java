Main.java

public class Main {
    public static void main (String[] args)
    {
   
      //  ATM atm1 = new ATM();
      //  atm1.CustName = "Manish";
     //   atm1.MobileNo = 123456;
     //   atm1.ACCBalance = 550;


       // System.out.println("Customer name is :" +atm1.CustName);
     //   atm1.ACCBalance = 10000;
     //   System.out.println("Acc Balance :" +atm1.ACCBalance);


      //  atm1.withdraw(990);
     //   atm1.ACCBalance = 1000;
     //   atm1.withdraw(1000);


     NewATM atm2 = new NewATM("Manish",123456,1000);
     atm2.withdraw(900);
     atm2.withdraw(200);


    }
}

NewATM.java

public class NewATM {
    private String CustName;
    private double MobileNo;
    private double BalanceAMT;






    public NewATM(String custName, double mobileNo, double Balance) {
        CustName = custName;
        MobileNo = mobileNo;
        BalanceAMT = Balance;
       
    }


    public void withdraw(double amount){
        if(BalanceAMTATM.java

//public class ATM {
 //   public String CustName;
 //   public double MobileNo;
 //   public double custBalance;


  //  public void withdraw(double amount){
  //      if(ACCBalance