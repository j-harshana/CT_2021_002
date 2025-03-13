package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double c,f;

        System.out.println("Enter the Temperature in Celsius:");
        c = scan.nextDouble();

        f = (1.8*c)+32;

        System.out.println("Temperature in Fahrenheit: "+df.format(f)+"F");
    }
}
