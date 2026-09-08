//To reverse and print the number

import java.util.*;

public class PrintReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Last digit of a number is 'number%10' e.g. 2005%10 will give 5 that is the remainder of 2005
        /*
        1. Last Digit of any Number --> num % 10
        2. Remove Last Digit of any Number --> num / 10
         */
        while ( n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println();
    }
}

//The above code can: 
/*
1. Prints digits directly
2. Uses System.out.print() inside loop
3. Cannot easily use the reversed value later
*/