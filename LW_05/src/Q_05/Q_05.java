package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase(Enter all characters in lowercase): ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("It's a palindrome..");
        } else {
            System.out.println("Not a palindrome..");
        }
        scanner.close();
    }
}

