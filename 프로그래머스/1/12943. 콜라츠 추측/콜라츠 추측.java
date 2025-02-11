class Solution {
    public int solution(int num) {
        if (num == 1)
            return 0;
        
        int answer = 0;
        long number = (long)num;
        while (number != 1 && answer < 500) {
            if (number % 2 == 0)
                number /= 2;
            else 
                number = number * 3 + 1;
            answer++;
        }
        
        if (answer >= 500)
            return -1;
        
        return answer;
    }
}