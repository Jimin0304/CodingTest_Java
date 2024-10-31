import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            list.add(i);
        }
        
        for (int i = 0; i < numlist.length; i++) {
            int distance = 9999;
            int element = 0;
            for (int num = 0; num < list.size(); num++) {
                if (distance == Math.abs(list.get(num) - n) && element < list.get(num)) {
                    element = list.get(num);
                }
                else if (distance > Math.abs(list.get(num) - n)) {
                    distance = Math.abs(list.get(num) - n);
                    element = list.get(num);
                }
            }
            answer[i] = element;
            list.remove(list.indexOf(element));
        }
        
        return answer;
    }
}