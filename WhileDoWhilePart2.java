public class  WhileDoWhilePart2 {
    public static void main(String[] args) {
        int count = 1;

        
        // while(count != 10){
        //     System.out.println("The Count is :" + count);
        //     count ++;
        // }
        

        // for (count = 1; count <= 10; count++) {
        //     System.out.println("The Count is :" + count);
        // }
        
        
        // while (true) {
        //     if (count == 6) {
        //     break;
        //     }
        // System.out.println("The Count is: " + count);
        // count++;
        // }
        
        //   do {
        //      System.out.println("The Count is: " + count);
        //      count++;
        //     } while (count != 6);
        
        //write a method to predict an odd number, if odd return true, else return false.
        // in the main using a while loop print all the odd numbers from 5 to 30

            int number = 4;
            int maxvalue = 29;

            while (number <= maxvalue){
                number++;
                    if (!OddNumberCheck(number)){
                        continue;
                    }
                System.out.println(number);
            }
}
            
            public static boolean OddNumberCheck(int number) {
                    if (number % 2 == 1) {
                            return true;
                    } else {
                        return false;
                        }
            }
    
}
