class Solution {
    public int calDiv(int num) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (i * i == num) cnt++;
            else if (num % i == 0) cnt += 2;
        }
        return cnt;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int cntDiv = calDiv(i);
            if (cntDiv > limit)
                cntDiv = power;
            answer += cntDiv;
        }
        
        return answer;
    }
}