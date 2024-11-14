import java.util.Arrays;

class Solution {
    public long solution(int[] arr) {
        long answer = 0;
        Arrays.sort(arr);
        long max = 1;
        for (int i = 0; i < arr.length; i++) {
            max *= (long)arr[i];
        }
        
        long num = arr[arr.length - 1];
        for (int i = 2; num <= max; i++) {
            boolean check = false;
            for (int j = 0; j < arr.length; j++) {
                if (num % arr[j] == 0)
                    continue ;
                check = true;
                break ;
            }
            if (check)
                num = arr[arr.length - 1] * i;
            else {
                answer = num;
                break ;
            }
        }
        
        return answer;
    }
}