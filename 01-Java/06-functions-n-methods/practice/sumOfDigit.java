import java.util.*;

public class sumOfDigit {
    public static void sumOfDigit (int num) {
        int sum = 0;
        int lastDigit = 0;
        
        while (num > 0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;

            num = num / 10;
        }
        System.out.println("Sum of the number is: " + sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        sumOfDigit(num);
    }
}
