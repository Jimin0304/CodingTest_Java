import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                int val = map.get(tangerine[i]);
                map.put(tangerine[i], val + 1);
            }
            else {
                cnt++;
                map.put(tangerine[i], 1);
            }
        }
        
        int[] arr = new int[cnt];
        int index = 0;
        for (int key : map.keySet()) { 
            arr[index++] = map.get(key);
        }
        Arrays.sort(arr);
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (k <= 0)
                break ;
            k = k - arr[i];
            answer++;
        }
        
        return answer;
    }
}