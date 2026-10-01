import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Greatest is: " + a);
        }
        else if (b > c) {
            System.out.println("Greatest is: " + b);
        }
        else {
            System.out.println("Greatest is: " + c);
        }
        
    }
}