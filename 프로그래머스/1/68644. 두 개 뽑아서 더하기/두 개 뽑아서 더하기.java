import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }    
        }
        
        Iterator iter = result.iterator();	
        int[] answer = new int[result.size()];
        int index = 0;
        while(iter.hasNext()) {
            answer[index++] = (int)iter.next();
        }
        Arrays.sort(answer);
        
        return answer;
    }
}