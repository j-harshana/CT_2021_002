package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();

        if (year%4 == 0 && year%100 != 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
