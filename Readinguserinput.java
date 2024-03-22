import java.util.Scanner;

public class Readinguserinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter Age");
        int Age = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("What is your name?");
        String userName = sc.nextLine();
        
      
        
        System.out.println("The username provided is: " + userName + " and the age is : " +Age);
    }
}
