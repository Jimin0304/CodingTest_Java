import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> wait = new LinkedList<>();
        Queue<int[]> crossing = new LinkedList<>();
        for (int truck : truck_weights) {
            wait.offer(truck);
        }
        
        int total_weight = 0;
        int cnt = 0;
        int time = 0;
        while (!wait.isEmpty() || !crossing.isEmpty()) {
            if (!crossing.isEmpty() && time - crossing.peek()[1] == bridge_length) {
                total_weight -= crossing.poll()[0];
                cnt--;
            }
            if (!wait.isEmpty() && (crossing.isEmpty() || (total_weight + wait.peek() <= weight && cnt < bridge_length))) {
                int truck = wait.poll();
                total_weight += truck;
                crossing.offer(new int[]{truck, time});
                cnt++;
            }
            time++;    
        }
        
        return time;
    }
}