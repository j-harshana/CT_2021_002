package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        int row;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        row = scan.nextInt();

        //loop through each row
        for(int i = 1; i <= row; i++){
            //printing the spaces on beginning of each line
            for(int j = i; j < row; j++){
                System.out.print(" ");
            }
            //printing the necessary amount of asterisks
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            //move to next line after print each line
            System.out.println();
        }
    }
}
