import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                while ((n % i) == 0) {
                    n /= i;
                    list.add(i);
                }
            }
        }
        
        List<Integer> answer = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(answer);
        
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}