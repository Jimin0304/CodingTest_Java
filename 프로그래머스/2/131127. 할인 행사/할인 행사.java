class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            int[] cnt = number.clone();
            for (int j = i; j < i + 10; j++) {
                for (int k = 0; k < want.length; k++) {
                    if (want[k].equals(discount[j]))
                        cnt[k]--;
                }
            }
            boolean chk = false;
            for (int j = 0; j < cnt.length; j++) {
                if (cnt[j] != 0) {
                    chk = true;
                    break ;
                }
            }
            if (!chk)
                answer++;
        }
        
        return answer;
    }
}