import java.util.*;

public class BinomialCoefficient {
    public static int factorial (int n) {
        int f = 1;
        for (int i=1; i<=n;i ++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);

        int binCoeff = n_fact / (r_fact * n_r_fact);

        return binCoeff;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int binCoeff = binCoeff(n, r);
        System.out.println("Binomial Coefficient is: " + binCoeff);
    }
}

//Remember this: 0 ≤ r ≤ n 