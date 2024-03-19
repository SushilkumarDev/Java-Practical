public class PrimitiveTypes{
    public static void main(String[] args) {
        int value = 1000;

        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Byte Max Value is " + maxValue);
        System.out.println("Byte Min Value is " + minValue);
        short maxVal = Short.MAX_VALUE;
        short minVal = Short.MIN_VALUE;
        System.out.println(maxVal);
        System.out.println(minVal);

        long maxValue1 = Long.MAX_VALUE;
        long minValue2 = Long.MIN_VALUE;
        System.out.println(maxValue1);
        System.out.println(minValue2);

        short myValue = 32761;
        long veryLongValue = 21474836471234L;
        System.out.println(veryLongValue);
		

        byte newByteValue = maxValue;
        byte newByteValue2 = (byte) (maxValue/2);
        System.out.println(newByteValue2);
        
        short newValue = (short) (myValue/2);
        System.out.println(newValue);


    }
}
