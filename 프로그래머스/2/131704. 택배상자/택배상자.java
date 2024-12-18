import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> assistant = new Stack<>();
        int box = 1;
        
        for (int i = 0; i < order.length; ) {
            while (box <= order.length && box != order[i]) {
                assistant.push(box++);
            }
            if (box == order[i]) {
                answer++;
                box++;
                i++;
            }
            else break ;
            while (!assistant.isEmpty() && i < order.length && assistant.peek().equals(order[i])) {
                assistant.pop();
                answer++;
                i++;
            }
        }
        
        return answer;
    }
}