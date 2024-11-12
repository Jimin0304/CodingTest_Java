class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int first = (int)((double)total / num * 2 - (num - 1)) / 2;
        for (int i = 0; i < num; i++) {
            answer[i] = first++;
        }
        
        return answer;
    }
}