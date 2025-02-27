package Q_12;
import javax.swing.*;

public class Q_12 {
    public static void main(String[] args) {
        JFrame windowLocation;
        windowLocation = new JFrame();
        windowLocation.setSize(300,200);
        windowLocation.setTitle("My First Frame");
        windowLocation.setLocation(100,50);
        windowLocation.setVisible(true);
        windowLocation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
