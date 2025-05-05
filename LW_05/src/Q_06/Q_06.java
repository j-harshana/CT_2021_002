package Q_06;

import java.util.Random;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        int random,guess;
        Random r = new Random();
        random = r.nextInt(100);

        do{
            System.out.print("\nGuess a number between 0 and 100: ");
            Scanner scan = new Scanner(System.in);
            guess = scan.nextInt();

            if(guess > random){
                System.out.println("Your guess is Higher, Guess again!");
            } else if (guess < random){
                System.out.println("Your guess is Lower, Guess again!");
            } else{
                System.out.println("Your guess is Correct!!");
            }
        } while(guess != random);
        System.out.println("\nThe random number was: "+random);
    }
}
