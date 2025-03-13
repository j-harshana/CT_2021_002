package Q_05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double c,f;

        System.out.println("Enter the Temperature in Fahrenheit:");
        f = scan.nextDouble();

        c =((f-32)*5/9);
        System.out.println("Temperature in Celsius: "+df.format(c)+"C");
    }
}
