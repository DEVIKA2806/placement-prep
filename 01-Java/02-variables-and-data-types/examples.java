import java.util.*; //this is used for input
// =========================
// 1. Boilerplate Code
// =========================
public class examples { //class name should be same as file name
    public static void main(String args[]) {

        // =========================
        // 2. Output in Java
        // =========================
        System.out.println("Hello World"); //in println() 'ln' is used to give next-line 
        System.out.print("Hello World\n"); //here '\n' is also used to give next-line
        System.out.print("Hello World"); //'print' is a function & ';' is a statement terminator
        System.out.println(); 

        // =========================
        // 3. Print a Pattern
        // =========================
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // =========================
        // 4. Variables in Java
        // =========================
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);

        a = 50;
        System.out.println(a);

        // =========================
        // 5. Data Types in Java
        // =========================
        byte by = 2;
        char ch = 'a';
        boolean var = true;
        float price = 10.5f;
        int num = 25;
        long rate = 1012244284;
        double val = 12.2389932;
        short sh = 240;

        // =========================
        // 6. Input in Java
        // =========================
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //'next' will only print single word, it will ignore rest of the sentence
        System.out.println(input);

        String name = sc.nextLine(); //'nextLine' to print entire sentence
        System.out.println(name);

        // =========================
        // 7. Output in Java
        // =========================

    }
}
