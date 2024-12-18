class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int turn = 1;
        int num = -1;
        
        while (t > 0) {
            num++;
            String strNum = Integer.toString(num, n).toUpperCase();
            
            for (int i = 0; i < strNum.length(); i++) {
                if (turn > m)
                    turn = 1;
                if (turn == p) {
                    answer += strNum.charAt(i);
                    t--;
                    if (t == 0) break ;
                }
                turn++;
            }
        }
        
        return answer;
    }
}