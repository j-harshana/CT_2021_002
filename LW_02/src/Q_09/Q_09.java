package Q_09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double P,R,N;

        System.out.println("Enter the principal investment amount: ");
        P = scan.nextDouble();

        System.out.println("Enter the interest rate: ");
        R = scan.nextDouble();

        System.out.println("Enter the number of years: ");
        N = scan.nextDouble();

        double amt = (P * (Math.pow((1 + (R/100)),N)));
        double earn = amt-P;

        System.out.println("Total interest earnings for "+N+" years: "+df.format(earn));
        System.out.println("Total amount after "+N+" years: " + df.format(amt));
    }
}
