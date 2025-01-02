import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public long solution(int[] queue1, int[] queue2) {
        long answer = 0;
        long sum1 = 0;
        long sum2 = 0;
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer((long)queue1[i]);
            q2.offer((long)queue2[i]);
        }
        
        while (sum1 != sum2 && answer < queue1.length * 3) {
            if (sum1 < sum2 && !q2.isEmpty()) {
                long now = q2.poll();
                q1.offer(now);
                sum1 += now;
                sum2 -= now;
                answer++;
            }
            else if (sum1 > sum2 && !q1.isEmpty()) {
                long now = q1.poll();
                q2.offer(now);
                sum1 -= now;
                sum2 += now;
                answer++;
            }
        }
        
        if (sum1 != sum2)
            answer = -1;

        return answer;
    }
}