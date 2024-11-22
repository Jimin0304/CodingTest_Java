import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        
        for (int index = 0; index < prices.length; index++) {
            while (!st.isEmpty() && prices[st.peek()] > prices[index]) {
                int idx = st.pop();
                answer[idx] = index - idx;
            }
            st.push(index);
        }
        
        while (!st.isEmpty()) {
            int idx = st.pop();
            answer[idx] = prices.length - 1 - idx;
        }
        
        return answer;
    }
}