package Q_02;
import javax.swing.*;
import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String firstName;
        System.out.println("Enter your first name:");
        firstName = scn.nextLine();

        String lastName;
        System.out.println("Enter your last name:");
        lastName = scn.nextLine();

        JFrame nameWindow;
        nameWindow = new JFrame();
        nameWindow.setSize(800,600);
        nameWindow.setTitle(firstName+" "+lastName);
        nameWindow.setVisible(true);
        nameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
