import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        
        int kilo = input.nextInt();
        int five = kilo / 5;
        
        if (kilo % 5 == 0) {    // 5 짜리로 끝날 때
            System.out.println(five);
            return ;
        }
        while (five >= 0) {
            int remaining = kilo - (five * 5);
            if (remaining % 3 == 0) {
                System.out.println(five + (remaining / 3));
                return ;
            }
            five--;
        }
        System.out.println(-1); // 불가할 때
    }
}