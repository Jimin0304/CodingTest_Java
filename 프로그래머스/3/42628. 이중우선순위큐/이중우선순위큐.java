import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].substring(0, 1).equals("I")) {
                minHeap.offer(Integer.parseInt(operations[i].substring(2)));
                maxHeap.offer(Integer.parseInt(operations[i].substring(2)));
            }
            else if (maxHeap.size() > 0 && operations[i].equals("D 1")) {
                int num = maxHeap.poll();
                minHeap.remove(num);
            }
            else if (minHeap.size() > 0 && operations[i].equals("D -1")) {
                int num = minHeap.poll();
                maxHeap.remove(num);
            }
        }
        
        if (minHeap.size() == 0) {
            answer[0] = 0;
            answer[1] = 0;
        }
        else {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }
          
        return answer;
    }
}