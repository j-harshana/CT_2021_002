package Q_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int w,h;

        System.out.println("Enter your weight in Kilograms: ");
        w = scan.nextInt();

        System.out.println("Enter your Height in centimeters: ");
        h = scan.nextInt();

        double bmi = (w/(Math.pow(((double)h/100.0),2)));

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("BMI: " + df.format(bmi) + " - Normal");
        }
        else if (bmi > 25) {
            System.out.println("BMI: " + df.format(bmi) + " - Overweight");
        }
        else {
            System.out.println("BMI: " + df.format(bmi) + " - Underweight");
        }
    }
}

