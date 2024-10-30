import java.util.HashMap;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String word : dic) {
            // spell map 0으로 초기화
            HashMap<Character, Integer> map = new HashMap<>();
            for (String str : spell) {
                map.put(str.charAt(0), 0);
            }

            // dic 단어마다 해당하는 spell 있을 때 횟수 구함
            for (int i = 0; i < word.length(); i++) {
                if (map.containsKey(word.charAt(i))) {
                    int tmp = map.get(word.charAt(i));
                    map.put(word.charAt(i), ++tmp);
                }
            }
                  
            int check = 1;
            for (Character key : map.keySet()) {
                if (map.get(key) != 1) {
                    check = 0;
                    break ;
                }
            }
            
            if (check == 1)
                return 1;
        }
        
        return answer;
    }
}