import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] type = new int[8];
        String standard = "RTCFJMAN";
        
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                type[standard.indexOf(survey[i].charAt(0))] += 3 - (choices[i] - 1);
            }
            else if (choices[i] > 4) {
                type[standard.indexOf(survey[i].charAt(1))] += (choices[i] - 1) - 3;
            }
        }
        
        for (int i = 0; i < type.length - 1; i += 2) {
            if (type[i] > type[i + 1])
                answer += standard.charAt(i);
            else if (type[i] < type[i + 1])
                answer += standard.charAt(i + 1);
            else
                answer += (char)Math.min(standard.charAt(i), standard.charAt(i + 1));
        }
        
        return answer;
    }
}