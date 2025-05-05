package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = scan.nextLine();

        System.out.print("Enter new replacement word: ");
        String newWord = scan.nextLine();

        String replaced = sentence.replace(oldWord, newWord);

        System.out.println("New sentence: " + replaced);
    }
}
