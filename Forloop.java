public class Forloop {
    public static void main(String[] args) {

        for(int i = 1; i <= 10 ;i++){
            SquareCalc(i);
        }

        // Print the multiplication table for 7 //
        for(int i = 1; i <= 10 ;i++){

            Multitable(i);
          }
          
          System.out.println(" 8 table");
           // Print the multiplication table for 8 //
        for(long i = 10; i >= 1 ;i--){

            Multitable(i);
          }
    }
        public static void SquareCalc(int i) {
            int j = i * i;
            System.out.println("The Square of " + i + " is: " + j);
        }

        public static void Multitable(int i) {
             int j = 7 * i;
            System.out.println(j);
        }
        
//method overloading is used here so don't confuse
         public static void Multitable(long i) {
             long j = 8 * i;
            System.out.println(j);
        }
}

