import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};
        
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        int cnt = 1;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > min)
                break ;
            cnt++;
        }
        int[] answer = new int[arr.length - cnt];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                continue ;
            answer[index++] = arr[i];
        } 
        
        return answer;
    }
}