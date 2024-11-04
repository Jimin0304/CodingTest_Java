import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        if (n > s)
            return new int[]{-1};
        
        int div = s / n;
        int mod = s % n;
        answer = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (mod > 0) {
                answer[i] = div + 1;
                mod--;
            }
            else
                answer[i] = div;
        }
        
        return answer;
    }
}