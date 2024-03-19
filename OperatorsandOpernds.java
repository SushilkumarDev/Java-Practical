public class OperatorsandOpernds {
    public static void main(String[] args) {
        int a = 1 + 2;
        int myValue = 10;

        // myValue = myValue + 10;
        myValue += 10;

        System.out.println("Value is " + myValue);

        // myValue = myValue - 10;
        myValue -= 10;

        System.out.println("New Value " + myValue);
        
        //myValue=myValue*10;
        myValue *= 10;
        System.out.println(myValue);
        
        
         //myValue=myValue/10;
        myValue /= 10;
        System.out.println("New Value: " + myValue);

        myValue = 10 % 3; // Remainder when 10 is divided by 3
        System.out.println(myValue);
        
        
        //myValue=myValue + 1;
        myValue++;
        System.out.println(myValue);
        
        
         //myValue=myValue - 1;
        myValue--;
        System.out.println(myValue); 
    }
}
