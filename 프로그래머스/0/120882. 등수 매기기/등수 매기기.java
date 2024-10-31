import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer =  new int[len];
        double[] avg = new double[len];
        double[] rank = new double[len];
        
        for (int i = 0; i < len; i++) {
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
            rank[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        Arrays.sort(rank);
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (avg[i] == rank[j])
                    answer[i] = len - j;
            }
        }
        
        return answer;
    }
}