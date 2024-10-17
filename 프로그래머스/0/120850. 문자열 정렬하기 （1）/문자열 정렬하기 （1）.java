import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[a-z]", "");
        int len = num.length();
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = (int)(num.charAt(i) - '0');
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}