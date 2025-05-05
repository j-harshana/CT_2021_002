package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Colors List:");
        System.out.println("\t0.Magenta");
        System.out.println("\t1.Cyan");
        System.out.println("\t2.Red");
        System.out.println("\t3.Blue");
        System.out.println("\t4.Green");
        System.out.print("\nSelect one color from the above list:");

        int color = scan.nextInt();
        scan.close();

        switch(color){
            case 0:
                System.out.println("You selected Magenta");
                break;
            case 1:
                System.out.println("You selected Cyan");
                break;
            case 2:
                System.out.println("You selected Red");
                break;
            case 3:
                System.out.println("You selected Blue");
                break;
            case 4:
                System.out.println("You selected Green");
                break;
            default:
                System.out.println("Invalid Color");
                break;
        }
    }
}
