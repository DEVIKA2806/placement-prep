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
        float price = 10.5f; //whenever we take float value we need to write 'f' after the value as it takes the value as double by default
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
        // 7. Type Conversion
        // =========================
        int c = 10;
        double d = c;

        // =========================
        // 8. Type Casting
        // =========================
        double e = 10.5;
        int f = (int)e;

        // =================================
        // 9. Type Promotion in Expression
        // =================================
        char g = 'a';
        short h = 50;
        System.out.println(c + d); //will give 147 as an output

        int i = 10;
        float j = 20.25f;
        long k = 25;
        double l =30.2033;

        double ans = i + j + k + l;
        System.out.println(ans); //will return 85.4533 and its type will be double as its the largest possible type
    }
}
