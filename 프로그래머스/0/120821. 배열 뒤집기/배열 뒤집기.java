class Solution {
    public int[] solution(int[] num_list) {
        int list_len = num_list.length;
        int[] answer = new int[list_len];
        int index = 0;
        
        for (int i = list_len - 1; i >= 0; i--) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}