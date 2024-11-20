import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        if (topping.length == 1)
            return answer;
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < topping.length; i++) {
            if (map2.containsKey(topping[i])) {
                int val = map2.get(topping[i]);
                map2.put(topping[i], val + 1);
            }
            else
                map2.put(topping[i], 1);
        }
        for (int i = 0; i < topping.length; i++) {
            if (map1.containsKey(topping[i])) {
                int val = map1.get(topping[i]);
                map1.put(topping[i], val + 1);
            }
            else
                map1.put(topping[i], 1);
            if (map2.containsKey(topping[i])) {
                if (map2.get(topping[i]) > 1) {
                    int val = map2.get(topping[i]);
                    map2.put(topping[i], val - 1);
                }
                else
                    map2.remove(topping[i]);
            }
            if (map1.size() == map2.size())
                answer++;
        }
        
        return answer;
    }
}