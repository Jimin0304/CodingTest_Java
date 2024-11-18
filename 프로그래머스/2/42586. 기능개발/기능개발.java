import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> pg = new LinkedList<>();
        Queue<Integer> speed = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            pg.offer(progresses[i]);
            speed.offer(speeds[i]);
        }
        
        int day = 0;
        while (!pg.isEmpty()) {
            int answer = 0;
            day++;
            while (!pg.isEmpty() && pg.peek() + day * speed.peek() >= 100) {
                pg.poll();
                speed.poll();
                answer++;
            }
            if (answer > 0)
                list.add(answer);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}