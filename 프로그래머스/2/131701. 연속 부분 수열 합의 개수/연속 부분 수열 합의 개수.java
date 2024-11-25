import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 1; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int total = 0;
                for (int k = 0; k < i; k++) {
                    total += elements[(j + k) % elements.length]; 
                }
                set.add(total);
            }
        }
        
        int total = 0;
        for(int i = 0; i < elements.length; i++){
            total += elements[i];
        }
        set.add(total);
        
        return set.size();
    }
}