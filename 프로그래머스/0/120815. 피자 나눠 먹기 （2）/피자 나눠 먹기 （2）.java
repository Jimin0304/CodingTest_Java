class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (true) {
            if ((++answer * 6) % n == 0)
                break ;
        }
        
        return answer;
    }
}


// (x * 6) % n == 0