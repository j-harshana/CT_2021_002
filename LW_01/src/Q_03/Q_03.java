package Q_03;
import java.util.*;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName, middleName, lastName;

        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();

        System.out.println("Enter your middle name: ");
        middleName = scan.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();

        System.out.println(firstName+" "+middleName.substring(0,1)+". "+lastName);

    }
}
