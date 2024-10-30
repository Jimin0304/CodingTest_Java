import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int num = 1;
        
        while (num + sides[0] <= sides[1]) {
            num++;
        }
        while (num <= sides[1] || num < sides[0] + sides[1]) {
            answer++;
            num++;
        }
        
        return answer;
    }
}