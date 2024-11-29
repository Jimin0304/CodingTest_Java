import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        
        for (int num : arr) {
            if (st.peek() != num)
                st.push(num);
        }
        
        int[] answer = new int[st.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}