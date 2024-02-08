import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input == 1) {
            System.out.println(1);
            return ;
        }
        int i = 2;
        int num = 6;
        int result = 1;
        while (i <= input) {
            i += num * result;
            ++result;
        }

        System.out.println(result);
    }
}