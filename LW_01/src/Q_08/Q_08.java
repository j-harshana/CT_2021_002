package Q_08;
import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        Integer split;

        System.out.println("Enter a string that contains a exclamation mark:");
        str = scan.nextLine();
        split = str.indexOf("!");

        System.out.println(str.substring(0,split));
        System.out.println(str.substring(split+1));

    }
}
