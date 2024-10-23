class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String strNum = String.valueOf(num);
        
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == (char)(k + '0')) {
                answer = i + 1;
                break ;
            }
        }
        
        if (answer == 0)
            answer = -1;
        
        return answer;
    }
}