import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue <int[]> waiting = new PriorityQueue<>(new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
        for (int[] job : jobs) {
            waiting.offer(job);
        }
        
        int time = 0;
        int sum = 0;
        PriorityQueue<int[]> working = new PriorityQueue<>(new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
        while (!working.isEmpty() || !waiting.isEmpty()) {
            while (!waiting.isEmpty() && (waiting.peek())[0] <= time)
                working.offer(waiting.poll());
            
            if (working.isEmpty()) {
                time = (waiting.peek())[0];
            }
            else {
                int[] now = working.poll();
                sum += (time + now[1]) - now[0];
                time += now[1];
            }
        }
        
        return sum / jobs.length;
    }
}