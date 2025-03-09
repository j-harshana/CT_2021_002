package Q_04;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Date date;
        SimpleDateFormat sdf;
        date = new Date();
        sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(date));
    }
}
