package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();

        System.out.println("\nMultiplication Table of "+n);
        for(int i=1; i < 11; i++){
            System.out.println("\t"+n+" * "+i+" = "+(n*i));
        }

    }
}
