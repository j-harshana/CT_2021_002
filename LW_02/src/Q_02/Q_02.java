package Q_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int cm;

        System.out.println("Enter centimeter Value:");
        cm = scan.nextInt();

        // 1ft = 30cm

        int feet = cm/30;
        float inch = cm%30 * 0.3937f;

        System.out.println(feet+"ft "+df.format(inch)+"in");
    }
}
