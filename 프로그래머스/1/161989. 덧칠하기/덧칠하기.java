import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        if (section.length == 1)
            return 1;
        if (m == 1)
            return section.length;
        
        int answer = 0;
        Arrays.sort(section);
        
        int start = 0;
        for (int i = 1; i < section.length; i++) {
            if (section[i] - section[start] + 1 > m) {
                answer++;
                start = i--;
            }
            else if (section[i] - section[start] + 1 == m) {
                answer++;
                start = i + 1;
            }
            else if (i + 1 == section.length) {  // 페인트 더 칠할 수 있는데, 배열 마지막 일 때
                answer++;
            }
        }
        
        return answer;
    }
}