package Q_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double weight;

        System.out.println("Enter Your Weight In Pounds: ");
        weight = scan.nextDouble();

        System.out.println("You need "+(df.format(weight*19))+"Kcal Of Calories in one day.");
    }
}
