import java.util.*;

public class TotalCostOfItems {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        //Approach 1
        float totalCost = (pencil + pen + eraser) * 1.18f; //1.18 (1 is Original Cost (100%) & 0.18 is GST (18%))

        System.out.println("Total Cost with GST: " + totalCost);

        //OR

        //Approach 2
        float total = pencil + pen + eraser;
        float gst = total + (0.18f * total);

        System.out.println("Total Cost with GST: " + gst);
    }
}