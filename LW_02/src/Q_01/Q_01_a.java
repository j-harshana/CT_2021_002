package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double A,B,C;

        System.out.println("Enter A:");
        A = scan.nextDouble();

        System.out.println("Enter B:");
        B = scan.nextDouble();

        System.out.println("Enter C:");
        C = scan.nextDouble();

        System.out.println(df.format(Math.sqrt(Math.pow(B,2)+4*A*C)));


    }
}
