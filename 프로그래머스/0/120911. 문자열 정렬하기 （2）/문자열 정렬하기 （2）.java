import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] str = my_string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (Character.isUpperCase(str[i]))
                str[i] = Character.toLowerCase(str[i]);
                
        }
        
        Arrays.sort(str);
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            answer.append(str[i]);
        }
        
        
        return answer.toString();
    }
}