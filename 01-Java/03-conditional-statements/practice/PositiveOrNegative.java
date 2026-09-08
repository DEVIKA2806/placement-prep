import java.util.*;

public class PositiveOrNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println(num + " is a Positive Number");
        }
        else {
            System.out.println(num + " is a Negative Number");
        }
    }
}
