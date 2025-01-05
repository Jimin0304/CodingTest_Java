class Solution {
    public int calDiv(int num) {
        int cnt = 1;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                cnt++;
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