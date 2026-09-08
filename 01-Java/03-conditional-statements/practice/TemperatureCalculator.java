import java.util.*;

public class TemperatureCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();

        if(temp > 100) {
            System.out.println("You have a Fever");
        }
        else {
            System.out.println("You don't have a Fever");
        }
    }
}
