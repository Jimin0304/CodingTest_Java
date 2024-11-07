import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        PriorityQueue<Integer> pqA = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqB = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            pqA.offer(A[i]);
            pqB.offer(B[i]);
        }
        
        int nowB = pqB.poll();
        while (!pqA.isEmpty()) {
            int nowA = pqA.poll();
            if (nowB > nowA) {
                answer++;
                if (!pqB.isEmpty())
                    nowB = pqB.poll();
                else
                    break ;
            }
        }
        
        return answer;
    }
}