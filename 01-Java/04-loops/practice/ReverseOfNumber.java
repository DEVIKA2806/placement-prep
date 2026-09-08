import java.util.*;

public class ReverseOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(reverse);

    }
}

//The above code can:
/*
1. Stores the reversed number
2. Prints once after loop
3. You can use reverse later in your program
 */

//NOTE: this is the better approach as we can use the reverse number anywhere in the code just by mentioning the reverse variable