class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int copyX = x;
        int total = 0;
        while (copyX > 0) {
            total += copyX % 10;
            copyX /= 10;
        }
        if (x % total != 0)
            answer = false;
        
        return answer;
    }
}