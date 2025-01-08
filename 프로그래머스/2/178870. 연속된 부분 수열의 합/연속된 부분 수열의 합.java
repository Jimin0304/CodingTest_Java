class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        answer[0] = -1; // 초기화 상태 구분
        
        int total = 0;
        int start = sequence.length - 1;
        for (int i = sequence.length - 1; i >= 0; i--) {
            total += sequence[i];
            if (total == k && (answer[0] == -1 || (answer[1] - answer[0] >= start - i))) {
                answer[0] = i;
                answer[1] = start;
                total -= sequence[start--];
            }
            else if (total > k) {
                total -= sequence[start--];
            }
        }
        
        return answer;
    }
}