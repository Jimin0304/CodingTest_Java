import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = triangle[i][0] + dp[i-1][0];
            for (int j = 1; j < i; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
            }
            dp[i][i] = triangle[i][i] + dp[i-1][i-1];
        }

        int max = dp[n-1][0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, dp[n-1][i]);
        }
        System.out.println(max);
    }
}

// dp[0][0] = 7;

// dp[1][0] = triangle[1][0] + dp[0][0];
// dp[1][1] = tirangle[1][1] + dp[0][0];

// dp[2][0] = triangle[2][0] + dp[1][0];
// dp[2][1] = triangle[2][1] + Math.max(dp[1][0], dp[1][1]);
// dp[2][2] = triangle[2][2] + dp[1][1];