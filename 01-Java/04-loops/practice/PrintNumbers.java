//To Print Numbers from 1 to n

import java.util.*;

public class PrintNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = sc.nextInt();

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
