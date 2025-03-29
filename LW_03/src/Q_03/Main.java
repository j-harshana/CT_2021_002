package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        Scanner out = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Enter the radius of inner circle: ");
        double innerRadius = inn.nextDouble();
        System.out.println("Enter the radius of outer circle: ");
        double outerRadius = out.nextDouble();

        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

        double area = (outerCircle.computeArea() - innerCircle.computeArea());
        System.out.println("The area is: "+ df.format(area));

        double circInn = innerCircle.computeCircumference();
        double circOut = outerCircle.computeCircumference();

        System.out.println("The circumference of the Inner circle: "+ df.format(circInn));
        System.out.println("The circumference of the Outer circle: "+ df.format(circOut));
    }

}
