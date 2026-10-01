import java.util.*;

public class example {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        return; //here return is not that necessary since the return type of function is void 
    }

    public static int printHello() {
        System.out.println("Hello");
        return 1; //here we have to return a integer value because the return type of the function is int and if we don't do that we will have an error.
    }

    public static void calculateSum(int n1, int n2) { //parameters OR formal parameters
        int sum = n1 + n2;
        System.out.println(sum);
    }

    public static void main(String args[]) {
        printHelloWorld(); //function call
        printHello(); //function call

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); //arguments OR actual parameters
    }
}
