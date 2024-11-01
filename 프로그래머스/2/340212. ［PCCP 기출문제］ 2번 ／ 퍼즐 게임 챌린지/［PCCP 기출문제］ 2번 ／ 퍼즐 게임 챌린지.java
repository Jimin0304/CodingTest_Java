import java.util.Arrays;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        long time = 0;
        int min = 1;
        int max = 1;
        int level = 0;
        int answer = 1;

        for (int i = 0; i < diffs.length; i++) {
            if (diffs[i] > max)
                max = diffs[i];
        }
        
        level = (min + max) / 2;
        while ((max - min) / 2 > 0) {
            time = 0;
            for (int i = 0; i < diffs.length; i++) {
                if (level >= diffs[i])
                    time += times[i];
                else
                    time += (diffs[i] - level) * (times[i] + times[i - 1]) + times[i];
            }
            if (time > limit) {
                min = level;
                level += (max - min) / 2;
            }
            else {
                answer = level;
                max = level;
                level -= (max - min) / 2;
            }
        }
        
        // 필요한 level이 max값일 때
        if (answer == 1) 
            answer = max;
        
        // 필요한 level이 min값일 때
        if (min == 1 && (max - min) < 2) {
            int temp = 0;
            for (int i = 0; i < diffs.length; i++) {
                if (1 >= diffs[i])
                    temp += times[i];
                else
                    temp += (diffs[i] - 1) * (times[i] + times[i - 1]) + times[i];
            }
            if (temp <= limit)
                answer = 1;
        }
        
        return answer;
    }
}