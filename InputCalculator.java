import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Input Calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Please select an operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        
        switch(operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                return;
        }
        
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is " + result);
    }
}
