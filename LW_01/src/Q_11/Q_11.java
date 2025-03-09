package Q_11;
import java.sql.SQLOutput;
import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName, firstName, middleName, lastName;

        System.out.println("Enter your full name: ");
        fullName = scan.nextLine();

        String[] parts = fullName.split(" ");

        if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];

            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }
    }
}