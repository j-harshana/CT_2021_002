package Q_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value 1: ");
        x = scan.nextInt();
        System.out.print("Enter Value 2: ");
        y = scan.nextInt();
        System.out.print("Enter Value 3: ");
        z = scan.nextInt();
        int min;

        if (x<y){
            if(x<z){
                min = x;
            }
            else{
                min = z;
            }
        }
        else{
            if(y<z){
                min = y;
            }
            else{
                min = z;
            }
        }

        System.out.print("Smallest Value is: "+min);
    }
}
