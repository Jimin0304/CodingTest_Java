import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                answer.append((char)((s.charAt(i) - 'a' + n) % 26 + 'a'));
            }
            else if (Character.isUpperCase(s.charAt(i))) {
                answer.append((char)((s.charAt(i) - 'A' + n) % 26 + 'A'));
            }
            else {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}