import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String part : participant) {
            if (map.containsKey(part)) {
                int val = map.get(part);
                map.put(part, val + 1);
            }
            else {
                map.put(part, 1);
            }
        }
        
        for (String comp : completion) {
            if (map.containsKey(comp) && map.get(comp) == 1)
                map.remove(comp);
            else if (map.containsKey(comp) && map.get(comp) > 1) {
                int val = map.get(comp);
                map.put(comp, val - 1);
            }
        }
        
        for (String key : map.keySet()) {
            answer = key;
        }
         
        return answer;
    }
}