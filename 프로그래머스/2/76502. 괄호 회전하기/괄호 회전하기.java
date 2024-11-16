import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            Stack<Character> st = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                if (!st.isEmpty() && ((st.peek() == '[' && str.charAt(j) == ']') || (st.peek() == '{' && str.charAt(j) == '}') || (st.peek() == '(' && str.charAt(j) == ')')))
                        st.pop();
                else
                    st.push(str.charAt(j));
            }
            if (st.isEmpty())
                answer++;
        }
        
        return answer;
    }
}