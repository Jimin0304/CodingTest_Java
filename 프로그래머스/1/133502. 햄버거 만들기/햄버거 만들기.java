import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] == 1) {
                if (st.isEmpty())
                    st.push(ingredient[i]);
                else if (st.peek() == 3) {
                    st.pop();
                    st.pop();
                    st.pop();
                    answer++;
                }
                else
                    st.push(ingredient[i]);
            }
            else if (!st.isEmpty() && (st.peek() + 1 == ingredient[i])) {
                st.push(ingredient[i]);
            }
            else {  // 앞에 저장된 재료들로는 더이상 햄버거를 만들 수 없을 때
                st.clear();
            }
        }
        
        return answer;
    }
}