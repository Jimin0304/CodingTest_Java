import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] map = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[N][3];
        dp[0][0] = map[0][0];
        dp[0][1] = map[0][1];
        dp[0][2] = map[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = map[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = map[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = map[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        
        System.out.println(Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));
    }
}