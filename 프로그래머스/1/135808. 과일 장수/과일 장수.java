import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int index = score.length - 1;
        while (index >= m - 1) {
            int min = score[index - m + 1];
            index -= m;
            answer += min * m;
        }
        
        return answer;
    }
}