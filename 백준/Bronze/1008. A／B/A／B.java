import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        BigDecimal A = new BigDecimal(sc.nextInt());
        BigDecimal B = new BigDecimal(sc.nextInt());

        System.out.println(A.divide(B, 9, BigDecimal.ROUND_DOWN));
    }
}