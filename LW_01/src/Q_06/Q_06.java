package Q_06;
import javax.swing.*;
import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, height;
        String title;

        System.out.println("Enter the width of the window:");
        width = sc.nextInt();

        System.out.println("Enter the height of the window:");
        height = sc.nextInt();

        System.out.println("Enter the title of the window:");
        sc.nextLine();
        title = sc.nextLine();

        JFrame customWindow;
        customWindow = new JFrame();
        customWindow.setSize(width,height);
        customWindow.setTitle(title);
        customWindow.setVisible(true);
        customWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
