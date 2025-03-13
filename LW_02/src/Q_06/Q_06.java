package Q_06;

import java.time.Year;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear;
        int currentYear = Year.now().getValue();

        System.out.println("Enter Your Birth Year: ");
        birthYear = scan.nextInt();

        int age = (currentYear-birthYear);
        System.out.println("You were born in "+birthYear+" and will be "+age+" years old this year.");


    }
}
