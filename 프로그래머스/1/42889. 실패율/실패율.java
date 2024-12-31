import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] rank = new double[N][2];
        Arrays.sort(stages);
        
        int start = 0;
        int challenger = stages.length;
        for (int i = 0; i < N; i++) {
            rank[i][0] = (double)(i + 1);
            int cnt = 0;
            while (start < stages.length && stages[start] == rank[i][0]) {
                start++;
                cnt++;
            }
            if (cnt == 0)
                rank[i][1] = 0;
            else
                rank[i][1] = (double)cnt / (double)challenger;
            challenger -= cnt;
        }
        
        Arrays.sort(rank, (o1, o2) -> {
            return Double.compare(o2[1], o1[1]);
        });
            
        for (int i = 0; i < N; i++) {
            answer[i] = (int)rank[i][0];
        }
        
        return answer;
    }
}