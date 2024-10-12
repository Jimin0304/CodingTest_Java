class Solution {
    public int[] solution(int[] numbers) {
        
        // Exception
        int numlen = numbers.length;
        if ((numlen < 1) || (numlen > 1000))
            return numbers; //temp
        for (int i = 0; i < numlen; i++) {
            if ((numbers[i] < -10000) || (numbers[i] > 10000))
                return numbers; //temp
        }
        
        int[] answer = new int[numlen];
        for (int i = 0; i < numlen; i++) {
            answer[i] = numbers[i] * 2;
        }
           
        return answer;
    }
}