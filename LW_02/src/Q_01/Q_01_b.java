package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double X,Y;

        System.out.println("Enter X:");
        X = scan.nextDouble();

        System.out.println("Enter Y:");
        Y = scan.nextDouble();

        System.out.println(df.format(Math.sqrt(X+(4*(Math.pow(Y,3))))));
    }
}
