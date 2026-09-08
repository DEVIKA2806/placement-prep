import java.util.*;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("Is a prime number");
        }
        else {
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++) {
                if (n%i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Is a prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}

/*
NOTE: there is property for non-prime numbers i.e. if 'n' is my non-prime number then from 2 <----> n-1 there will a divisor that will completely divide the 'n'
e.g. 6: 2 <----> 5 there is 2 & 3 that completely divides the number 6.
*/