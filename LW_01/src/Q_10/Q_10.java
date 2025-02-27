package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String oddWord;

        System.out.println("Enter an odd-length word:");
        oddWord = scn.next();

        System.out.println(oddWord.charAt(oddWord.length()/2));
    }
}
