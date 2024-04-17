import java.util.Scanner;


public class CodeforArray {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
     


      int[] userArray = getUserArray(6);
      int userSum = userSum(userArray);
      System.out.println("The sum is : "+userSum);


     


     
     
       sc.close();
       
    }
    public static int[] getUserArray(int number){
       
     
        System.out.println("Enter " + number + " integers");
       
        int[] userValues = new int[number];


        for(int i =0;i<userValues.length;i++)
       {
        userValues[i] = sc.nextInt();
       }
       return userValues;
    }


    public static int userSum(int[] array){
        int sum = 0;


        for(int i =0;i<array.length;i++){
            sum += array[i];


        }
        return sum ;




    }
}
