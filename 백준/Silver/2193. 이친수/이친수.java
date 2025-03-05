import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dp = new long[91];    // overflow
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        if (N <= 3) {
            System.out.println(dp[N]);
            return ;
        }
        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        System.out.println(dp[N]);
    }
}


/*
    1        
    10       
    100      
    101       
    1000
    1001
    1010       
    10000
    10100
    10101
    10010
    10001
    100000
    101000
    101010
    101001
    100100
    100101
    100010
    100001
*/