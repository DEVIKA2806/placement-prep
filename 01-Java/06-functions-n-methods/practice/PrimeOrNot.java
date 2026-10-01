import java.util.*;

public class PrimeOrNot {
    public static boolean isPrime(int n) {
        //corner case
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i=2; i<=n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = isPrime(n);
        System.out.println("Answer is: " + result);
    }
}
