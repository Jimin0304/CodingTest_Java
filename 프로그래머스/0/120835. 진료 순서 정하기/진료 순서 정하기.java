class Solution {
    public int[] solution(int[] emergency) {
        int emergency_len = emergency.length;
        int[] answer = new int [emergency_len];
        
        for (int i = 0; i < emergency_len; i++) {
            answer[i]++;
            for (int j = 0; j < emergency_len; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}