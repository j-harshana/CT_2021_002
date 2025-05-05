package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static int digitCount(int count) {
        return String.valueOf(Math.abs(count)).length();
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("\nEnter an integer: ");
            num = scan.nextInt();
            if(num >= 0)
                System.out.println("Number of Digits: "+digitCount(num));
        } while(num >= 0);
    }
}
