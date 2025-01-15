import java.util.*;

class Solution {  
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            String bit = Long.toString(numbers[i], 2);
            StringBuilder result = new StringBuilder();
            for (int j = bit.length() - 1; j >= 0; j--) {
                if (bit.charAt(j) == '0') {
                    if (j == bit.length() - 1)
                        result.append(bit.substring(0, j)).append("1");
                    else
                        result.append(bit.substring(0, j)).append("10").append(bit.substring(j + 2)); 
                    break ;
                }
            }
            if (result.length() == 0) {
                result.append("10").append(bit.substring(1));
            }
            answer[i] = Long.parseLong(result.toString(), 2);
        }
        return answer;
    }
}