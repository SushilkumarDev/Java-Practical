public class Billburgers

{

    public static void main(String args[]) {

        int vegBurgerCost = 4 * 45;

        int vegMcPuffCost = 3 * 25;

        int total = vegBurgerCost + vegMcPuffCost;

        int amt = total - 50;

        System.out.println("4 Vegetable Burgers @ 45 = " + vegBurgerCost);

        System.out.println("3 Vegetable McPuffs @ 25 = " + vegMcPuffCost);

        System.out.println("Total = " + total);

        System.out.println("Discount = 50");

        System.out.println("Final Bill = " + amt);

    }

}