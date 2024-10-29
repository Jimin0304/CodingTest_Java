import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int maxMinus = numbers[0] * numbers[1];
        int maxPlus = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if (maxMinus > maxPlus)
            answer = maxMinus;
        else
            answer = maxPlus;
        
        return answer;
    }
}