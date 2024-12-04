import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        List<Integer> reserve_list = new ArrayList<>();
        for (int num : reserve) {
            reserve_list.add(num);
        }
        // 여벌 가져왔는데 체육복 도난당한 학생 예외처리
        for (int i = 0; i < lost.length; i++) {
            if (reserve_list.contains(lost[i])) {
                reserve_list.remove(Integer.valueOf(lost[i]));
                lost[i] = -1;
                answer++;
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            if (reserve_list.contains(lost[i] - 1)) {
                reserve_list.remove(Integer.valueOf(lost[i] - 1));
                answer++;
            }
            else if (reserve_list.contains(lost[i] + 1)) {
                reserve_list.remove(Integer.valueOf(lost[i] + 1));
                answer++;
            }
        }

        return answer;
    }
}