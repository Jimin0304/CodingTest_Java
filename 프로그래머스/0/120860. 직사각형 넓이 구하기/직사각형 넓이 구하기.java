class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0, y = 0;
        
        for (int i = 1; i < dots.length; i++) {
            if (dots[0][0] != dots[i][0])
                x = dots[0][0] - dots[i][0];
            if (dots[0][1] != dots[i][1])
                y = dots[0][1] - dots[i][1];
        }
        
        if (x * y < 0)
            answer = -x * y;
        else
            answer = x * y;
              
        return answer;
    }
}