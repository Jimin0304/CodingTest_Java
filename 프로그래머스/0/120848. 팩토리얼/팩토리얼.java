class Solution {
    
    public int solution(int n) {
        int answer = 0;
        int factorial_num = 1;
    
        for (int i = 0; factorial_num <= n; i++) {
            factorial_num *= (i + 1);
            answer++;
        }
        
        return answer - 1;
    }
}