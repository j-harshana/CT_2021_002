package Q_07;
import java.util.*;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class Q_07 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String time = sdf.format(now);

        JFrame timeWindow;
        timeWindow = new JFrame();
        timeWindow.setSize(800,600);
        timeWindow.setTitle(time);
        timeWindow.setVisible(true);
        timeWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
