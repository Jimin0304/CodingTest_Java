import java.util.Scanner;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextLong());
        }

        for (int i = 0; i < m && pq.size() > 1; i++) {
            Long num1 = pq.poll();
            Long num2 = pq.poll();
            
            pq.offer(num1 + num2);
            pq.offer(num1 + num2);
        }

        Long result = 0L;
        while (!pq.isEmpty()) {
            result += pq.poll();
        }
        System.out.println(result);
    }
}