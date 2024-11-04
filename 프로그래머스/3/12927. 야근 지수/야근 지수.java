import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int total = 0;
        for (int num : works) {
            pq.offer(num);
            total += num;
        }
        if (total - n <= 0)
            return 0;
        
        while (n > 0) {
            int now = pq.poll();
            pq.offer(now - 1);
            n--;
        }
        
        for (int i = 0; i < works.length; i++) {
            answer += Math.pow(pq.poll(), 2);
        }
        
        return answer;
    }
}