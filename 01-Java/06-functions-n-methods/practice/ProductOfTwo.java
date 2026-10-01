import java.util.*;

public class ProductOfTwo {
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = product(a, b);

        System.out.println("Product is: " + result);
    }
}
