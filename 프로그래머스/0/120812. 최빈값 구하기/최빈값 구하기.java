import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] checkarr = new int[1000];
        int num = 0;
        
        for (int i = 0; i < array.length; i++) {
            checkarr[array[i]]++;
            if (checkarr[array[i]] == num) {
                answer = -1;
            }
            else if (checkarr[array[i]] > num) {
                num = checkarr[array[i]];
                answer = array[i];
            }
        }
        
        return answer;
    }
}