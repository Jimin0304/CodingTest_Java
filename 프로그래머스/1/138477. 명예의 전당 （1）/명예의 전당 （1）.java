import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k && i < score.length; i++) {   // initial setting
            pq.offer(score[i]);
            answer[i] = pq.peek();
        }
        if (k >= score.length)
            return answer;
        
        for (int i = k; i < score.length; i++) {
            if (pq.peek() < score[i]) {
                pq.poll();
                pq.offer(score[i]);
            }
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}