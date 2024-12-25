import java.util.*;

class Solution {
    public void makeDict(List<String> dict, String word, String now) {
        dict.add(now);
        if (now.length() == 5) return ;
        if (now.equals(word)) return ;
        
        for (char c : "AEIOU".toCharArray()) {
            makeDict(dict, word, now + c);
        }
    }
    
    public int solution(String word) {
        List<String> dict = new ArrayList<>();
        
        makeDict(dict, word, "");
        
        return dict.indexOf(word);
    }
}