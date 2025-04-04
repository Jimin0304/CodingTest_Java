class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        while (b > 1) {
            if (b % 2 == 0)
                b /= 2;
            else if (b % 5 == 0)
                b /= 5;
            else if (a % b == 0) {
                a /= b;
                b /= b;
            }
            else {
                answer = 2;
                break ;
            }
        }
        
        return answer;
    }
}