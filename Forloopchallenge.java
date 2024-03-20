
// A prime number is a number which is divisible by 1 and itself.

// Print Prime numbers from 1 to n.

public class Forloopchallenge {
    public static void main(String args[]) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            isprime(i);
        }
 
    }
 
    public static void isprime(int n) {
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0)
                count = count + 1;
        }
        if (count == 2)
            System.out.println(n + " Is a prime number");
    }
}