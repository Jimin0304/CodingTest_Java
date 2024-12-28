import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {   // 가장 적게 누르는 카운트 저장
            for (int j = 0; j < keymap[i].length(); j++) {
                String now = keymap[i].substring(j, j + 1);
                if (!map.containsKey(now))
                    map.put(now, j + 1);
                else {
                    int value = map.get(now);
                    if (value > j + 1)
                        map.put(now, j + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int total = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                String now = targets[i].substring(j, j + 1);
                if (map.containsKey(now))
                    total += map.get(now);
                else {
                    total = -1;
                    break ;
                }
            }
            answer[i] = total;
        }
        
        return answer;
    }
}