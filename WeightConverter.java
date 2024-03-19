
// Declare a double variable weightKgs and take input from the user in kilograms. Also, Create a method convert(double kgs) and convert the weight to grams and milligrams.


import java.util.Scanner;
 
public class  WeightConverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kilograms ");
        double weightKgs = sc.nextDouble();
        convert(weightKgs);
    }
 
    public static void convert(double Kgs) {
        double weightGms, weightMg;
        weightGms = Kgs * 1000;
        weightMg = weightGms * 1000;
        System.out.println("The converted weight in grams is = " + weightGms);
        System.out.println("The converted weight in miligrams is = " + weightMg);

    }
}