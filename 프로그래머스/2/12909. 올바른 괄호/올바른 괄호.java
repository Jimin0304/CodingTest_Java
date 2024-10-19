import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.add(i);
            else {
                if (st.isEmpty())
                    return false;
                st.pop();
            }
        }
        
        if (st.isEmpty())
            answer = true;
        else
            answer = false;

        return answer;
    }
}