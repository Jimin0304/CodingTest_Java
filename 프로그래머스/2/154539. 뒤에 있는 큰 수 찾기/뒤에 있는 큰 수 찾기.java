import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> st = new Stack<>();
        
        for (int index = numbers.length - 1; index >= 0; index--) {
            while (!st.isEmpty() && numbers[index] >= st.peek()) {
                st.pop();
            }
            if (!st.isEmpty() && numbers[index] < st.peek()) {
                answer[index] = st.peek();
            }
            st.push(numbers[index]);
        }
        
        return answer;
    }
}