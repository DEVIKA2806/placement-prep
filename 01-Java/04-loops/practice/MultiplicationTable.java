//Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int multiple = 0;

        for (int i=1; i<=10; i++) {
            multiple = num * i;
            System.out.println(num + " * " + i + " = " + multiple);
        }
    }
}
