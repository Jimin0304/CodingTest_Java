import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int num : win_nums) {
            list.add(num);
        }
        
        int random = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0)
                random++;
            else if (list.contains(lottos[i])) {
                answer[0]++;
                answer[1]++;
            }
        }
        
        answer[0] = 7 - (answer[0] + random);
        if (answer[0] == 7)
            answer[0] = 6;
        answer[1] = 7 - answer[1];
        if (answer[1] == 7)
            answer[1] = 6;
        
        return answer;
    }
}