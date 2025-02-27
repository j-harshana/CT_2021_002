package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        System.out.println("Enter a string:");
        str = scan.nextLine();

        System.out.println(str.length());
        System.out.println(str.substring(0,1));
        System.out.println(str.charAt(str.length()-1));

    }
}
