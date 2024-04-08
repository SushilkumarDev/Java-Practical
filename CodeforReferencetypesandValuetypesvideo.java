import java.util.Arrays;




public class CodeforReferencetypesandValuetypesvideo{
public static void main(String[] args) {
   int firstInt = 9;
   int secondInt = firstInt;
   
   System.out.println("The first int value is : " +firstInt);
   System.out.println("The second int value is : " +secondInt);
 
   secondInt = secondInt + 1;
 
   System.out.println("The new first int value is : "+firstInt);
   System.out.println("The new second int value is : "+secondInt);
 
   int[] myFirstArray = new int[7];
   int[] mySecondArray = myFirstArray;
 
   System.out.println("My first array is : "+ Arrays.toString(myFirstArray));
   System.out.println("the second array is"+ Arrays.toString(mySecondArray));


   mySecondArray[5] = 1;
   System.out.println("the updated first array is"+ Arrays.toString(myFirstArray));
   System.out.println("the updated second array is"+ Arrays.toString(mySecondArray));


   modifyArray(mySecondArray);



      System.out.println("the modified first array is"+ Arrays.toString(myFirstArray));
   System.out.println("the modified second array is "+ Arrays.toString(mySecondArray));
   mySecondArray = new int[7];
   mySecondArray[0] = 10;


   System.out.println("the latest first array is "+ Arrays.toString(myFirstArray));
   System.out.println("the latest second array is "+ Arrays.toString(mySecondArray));


}
public static void modifyArray(int[] array){
    array[2] = 1;


   
}
}

