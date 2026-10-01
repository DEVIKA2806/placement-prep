import java.util.*;

public class PrimeOrNotOptimized {
    public static boolean isPrime(int n) {
        //corner case
        if (n == 2) {
            return true;
        }
        
        for (int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = isPrime(n);
        System.out.println("Answer is: " + result);
    }
}
