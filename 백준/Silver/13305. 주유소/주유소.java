import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] distance = new long[N - 1];
        long[] cost = new long[N];
        for (int i = 0; i < N - 1; i++) {    // init
            distance[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {        // init
            cost[i] = sc.nextLong();
        }
        
        long total = cost[0] * distance[0];
        long minCost = cost[0];
        for (int i = 1; i < N - 1; i++) {
            if (minCost > cost[i]) {
                minCost = cost[i];
            }
            total += (minCost * distance[i]);
        }
        
        System.out.println(total);
    }
}