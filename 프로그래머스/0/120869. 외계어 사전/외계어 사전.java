import java.util.HashMap;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (String d : dic) {
            boolean check = true;
            
            for (String s: spell) {
                if (!d.contains(s)) {
                    check = false;
                    break ;
                }
            
            }
            if (check == true)
                return 1;
        }
        
        return answer;
    }
}