import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            if (now == 0 && pq.isEmpty()) System.out.println(0);
            else if (now == 0) System.out.println(pq.poll());
            else pq.offer(now);
        }
    }
}