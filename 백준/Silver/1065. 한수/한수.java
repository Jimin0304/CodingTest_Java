import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 99;
        
        if (N < 100) {
            System.out.println(N);
            return ;
        }
        for (int i = 100; i <= N; i++) {
            int one =i % 10;
            int ten = (i / 10) % 10;
            int hundred = i / 100;

            if (one - ten == ten - hundred)
                result++;
        }

        System.out.println(result);
    }
}