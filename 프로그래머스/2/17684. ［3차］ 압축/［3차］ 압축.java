import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dictionary = new HashMap<>();
        int index = 1;
        while (index <= 26) {
            dictionary.put(Character.toString('A' + index - 1), index++);
        }
        
        int i = 0;
        while (i < msg.length()) {
            int cnt = 1;
            while (i + cnt <= msg.length() && dictionary.containsKey(msg.substring(i, i + cnt))) {
                cnt++;
            }
            
            if (i + cnt <= msg.length())
                dictionary.put(msg.substring(i, i + cnt), index++);
            
            answer.add(dictionary.get(msg.substring(i, i + cnt - 1)));
            
            i = i + cnt - 1;
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}