package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        final double PI = 3.14159;
        double radius;

        System.out.println("Enter the radius value: ");
        radius = scan.nextDouble();

        System.out.println("Area of the circle is: "+df.format(PI*radius*radius));
    }
}
