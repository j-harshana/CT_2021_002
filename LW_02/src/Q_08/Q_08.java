package Q_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");
        final double PI = 3.14159;
        double r;

        System.out.println("Enter the radius of the sphere: ");
        r = scan.nextDouble();

        double v = ((4.0/3.0) * (PI * Math.pow(r,3)));

        System.out.println("Volume of the sphere: " + df.format(v));

    }
}
