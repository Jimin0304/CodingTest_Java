import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for (char c : X.toCharArray()) cntX[c - '0']++;
        for (char c : Y.toCharArray()) cntY[c - '0']++;
        
        for (int i = 9; i >= 0; i--) {
            int cnt = Math.min(cntX[i], cntY[i]);
            while (cnt > 0) {
                answer.append(String.valueOf(i));
                cnt--;
            }
        }
        
        if (answer.length() == 0)
            return "-1";
        if (answer.charAt(0) == '0')
            return "0";
        
        return answer.toString();
    }
}