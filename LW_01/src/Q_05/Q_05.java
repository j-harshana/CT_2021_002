package Q_05;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date();
        sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println("Today's date is: " + sdf.format(today));
    }
}
