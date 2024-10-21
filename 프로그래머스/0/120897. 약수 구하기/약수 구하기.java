import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                list.add(i);
        }
        
        int[] answer = new int[list.size() + 1];
        int index = 0;
        for (index = 0; index < answer.length - 1; index++) {
            answer[index] = list.get(index);
        }
        answer[index] = n;
        
        return answer;
    }
}