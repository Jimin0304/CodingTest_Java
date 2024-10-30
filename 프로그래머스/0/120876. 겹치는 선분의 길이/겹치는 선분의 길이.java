import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Arrays.sort(lines, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        boolean[] check = new boolean[200];

        if (lines[0][1] > lines[1][0]) {
            for (int i = lines[1][0] + 100; i < lines[0][1] + 100 && i < lines[1][1] + 100; i++) {
                check[i] = true;
            }
        }
        if (lines[1][1] > lines[2][0]) {
            for (int i = lines[2][0] + 100; i < lines[1][1] + 100 && i < lines[2][1] + 100; i++) {
                check[i] = true;
            }
        } 
        if (lines[0][1] > lines[2][0]) {
            for (int i = lines[2][0] + 100; i < lines[0][1] + 100 && i < lines[2][1] + 100; i++) {
                check[i] = true;
            }
        }
        
        for (int i = 0; i < check.length; i++) {
            if (check[i])
                answer++;
        }
        
        return answer;
    }
}