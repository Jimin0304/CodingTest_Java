class Solution {
    public int[] solution(int[] emergency) {
        int emergency_len = emergency.length;
        int[] answer = new int [emergency_len];
        int[] dup_emer = emergency.clone();
        int temp = 0;
        
        // sort
        for (int i = 0; i < emergency_len; i++) {
            for (int j = i; j < emergency_len; j++) {
                if (dup_emer[i] < dup_emer[j]) {
                    temp = dup_emer[j];
                    dup_emer[j] = dup_emer[i];
                    dup_emer[i] = temp;        
                }
            }
        }
        
        // numbering
        for (int i = 0; i < emergency_len; i++) {
            for (int j = 0; j < emergency_len; j++) {
                if (emergency[i] == dup_emer[j]) {
                    answer[i] = j + 1;
                    break ;
                }
            }
        }
        
        return answer;
    }
}