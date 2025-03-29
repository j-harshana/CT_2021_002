package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q_01
        Scanner temp1 = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Enter the Celsius Value: ");
        double celsius = temp1.nextDouble();

        Temperature t1= new Temperature();
        t1.setCelsius(celsius);
        System.out.println("The celsius value in fahrenheit is: "+df.format(t1.toFahrenheit()));

        //Q_02
        Scanner temp2 = new Scanner(System.in);

        System.out.println("Enter fahrenheit Value: ");
        double fahrenheit = temp2.nextDouble();

        Temperature t2 = new Temperature();
        t2.setFahrenheit(fahrenheit);
        System.out.println("The fahrenheit value in celsius is: "+df.format(t2.toCelsius()));
    }
}
