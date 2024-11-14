import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        answer[1] = 1;

        for (int i = 1; i < words.length; i++) {
            if (i % n == 0)
                answer[1]++;
            if (!list.contains(words[i]) && words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0))
                list.add(words[i]);
            else {
                answer[0] = i % n + 1;
                break ;
            }
        }
        
        if (answer[0] == 0)
            answer[1] = 0;
        
        return answer;
    }
}