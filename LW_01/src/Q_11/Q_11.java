package Q_11;
import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName, middleName, lastName;

        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();

        System.out.println("Enter your middle name: ");
        middleName = scan.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();

        System.out.println(lastName+", "+firstName+" "+middleName.charAt(0)+".");

    }
}