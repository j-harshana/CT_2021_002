package Q_01;

public class Q_01 {
    public static void main(String[] args) {
        for(int i = 10; i <= 49; i++){
            System.out.print(i+" ");
            if((i+1) % 10 == 0)
                System.out.println();
        }
    }
}
