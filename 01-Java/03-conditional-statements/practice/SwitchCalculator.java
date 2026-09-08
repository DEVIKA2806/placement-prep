//this is user driven code where user input is taken to perform task

import java.util.*;

public class SwitchCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a: "); 
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter operator: ");
        char symbol = sc.next().charAt(0);

        switch(symbol) {
            case '+': System.out.println("Add: " + (a + b));
            break;
            case '-': System.out.println("Sub: " + (a - b));
            break;
            case '*': System.out.println("Mul: " + (a * b));
            break;
            case '/': System.out.println("Div: " + (a / b));
            break;
            case '%': System.out.println("Mod: " + (a % b));
            break;
            default: System.out.println("Wrong input");
        }
    }
}
