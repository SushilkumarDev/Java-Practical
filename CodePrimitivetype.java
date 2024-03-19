public class CodePrimitivetype {
    public static void main(String[] args) {
        int number1 = 10;
        byte number2 = 15 ;
        short number3 =5 ;
        
        long longSum =1000*(number1+number2+number3);
        System.out.println(longSum);
        
        short shortsum = (short) (1000*(number1+number2+number3));
        System.out.println(shortsum);
    }
}
