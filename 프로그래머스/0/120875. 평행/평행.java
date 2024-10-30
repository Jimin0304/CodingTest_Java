class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[][] dbDots = new double[dots.length][dots[0].length];
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[0].length; j++) {
                dbDots[i][j] = (double)dots[i][j];
            }
        }
        
        if ((dbDots[0][1] - dbDots[1][1]) / (dbDots[0][0] - dbDots[1][0]) == (dbDots[2][1] - dbDots[3][1]) / (dbDots[2][0] - dbDots[3][0]))
            return 1;
        if ((dbDots[0][1] - dbDots[2][1]) / (dbDots[0][0] - dbDots[2][0]) == (dbDots[1][1] - dbDots[3][1]) / (dbDots[1][0] - dbDots[3][0]))
            return 1;
        if ((dbDots[0][1] - dbDots[3][1]) / (dbDots[0][0] - dbDots[3][0]) == (dbDots[1][1] - dbDots[2][1]) / (dbDots[1][0] - dbDots[2][0]))
            return 1;
        
        return answer;
    }
}