import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
    
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % 5])
                scores[0]++;
            if (answers[i] == student2[i % 8])
                scores[1]++;
            if (answers[i] == student3[i % 10])
                scores[2]++;
        }
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max)
                answer.add(i + 1);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}