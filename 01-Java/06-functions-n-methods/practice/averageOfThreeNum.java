import java.util.*;

public class averageOfThreeNum {
    public static void averageOfNum(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("Average of Three numbers is: " + average);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        System.out.println("Enter third num: ");
        int c = sc.nextInt();

        averageOfNum(a, b, c);

    }
}
