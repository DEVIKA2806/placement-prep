import java.util.*;

public class BinToDec {
    public static void binToDec(int binNum) {
        int num = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow)); //type caste the power into int

            pow++;
            binNum = binNum/10; 
        }
        System.out.println("Decimal of " + num + " = " + decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number is 0s and 1s: ");
        int binNum = sc.nextInt();

        binToDec(binNum);
    }
}
