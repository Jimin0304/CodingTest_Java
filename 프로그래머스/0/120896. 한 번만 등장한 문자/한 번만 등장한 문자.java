import java.util.HashMap;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), 0);
        }
    
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        
        for (char key : map.keySet()) {
            if (map.get(key) == 1)
                answer.append(key);
        }
        
        return answer.toString();
    }
}