import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] top = new int[board.length];
        Arrays.fill(top, -1);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0 && top[j] == -1) {
                    top[j] = i; 
                }
            }
        }
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            if (top[moves[i] - 1] >= board.length)  // 아무것도 없을 때
                continue ;
            if (!st.isEmpty() && board[top[moves[i] - 1]][moves[i] - 1] == st.peek()) {
                st.pop();
                answer += 2;
            }
            else
                st.push(board[top[moves[i] - 1]][moves[i] - 1]);
            top[moves[i] - 1]++;
        }
        
        return answer;
    }
}