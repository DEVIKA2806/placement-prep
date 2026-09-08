//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;

public class SumOfEvenOrOdd { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for(int i=1; i<=count; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                evenSum = evenSum + n;
            } else {
                oddSum = oddSum + n;
            }
        }
        System.out.println("Even Sum is: " + evenSum);
        System.out.println("Odd Sum is: " + oddSum);
    }
}