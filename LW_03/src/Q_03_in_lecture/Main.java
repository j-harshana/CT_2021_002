package Q_03_in_lecture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double innerCircleRadius;
        double outerCircleRadius;
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the inner Circle Radius: ");
        innerCircleRadius = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the outer Circle Radius: ");
        outerCircleRadius = scan2.nextDouble();

        Circle innerCircle = new Circle(innerCircleRadius);
        Circle outerCircle = new Circle(outerCircleRadius);

        double innerCircleArea = innerCircle.computeArea();
        double outerCircleArea = outerCircle.computeArea();

        double shadedArea = outerCircleArea-innerCircleArea;
        System.out.println("Shaded Area: "+ df.format(shadedArea));

        double innerCircleCircumference = innerCircle.computeCircumference();
        double outerCircleCircumference = outerCircle.computeCircumference();
        System.out.println("Inner Circle Circumference: "+ df.format(innerCircleCircumference));
        System.out.println("Outer Circle Circumference: "+ df.format(outerCircleCircumference));

    }
}
