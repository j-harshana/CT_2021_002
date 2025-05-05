package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the power of 10th you want to know what its called: ");
        int power = scan.nextInt();

        switch(power){
            case 6:
                System.out.println("10^6 is called 'Million'");
                break;
            case 9:
                System.out.println("10^9 is called 'Billion'");
                break;
            case 12:
                System.out.println("10^12 is called 'Trillion'");
                break;
            case 15:
                System.out.println("10^15 is called 'Quadrillion'");
                break;
            case 18:
                System.out.println("10^18 is called 'Quintillion'");
                break;
            case 21:
                System.out.println("10^21 is called 'Sextillion'");
                break;
            case 30:
                System.out.println("10^30 is called 'Nonillion'");
                break;
            case 100:
                System.out.println("10^100 is called 'Googol'");
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}









