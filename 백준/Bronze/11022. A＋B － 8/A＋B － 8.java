import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
        }
    }
}