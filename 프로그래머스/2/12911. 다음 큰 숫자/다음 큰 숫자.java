class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        
        while (true) {
            int count = Integer.bitCount(++n);
            if (count == cnt) {
                answer = n;
                break ;
            }
        }
        
        return answer;
    }
}