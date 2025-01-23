class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String num = "0123456789";
        
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (num.indexOf(s.substring(i, i + 1)) == -1) {
                    answer = false;
                    break ;
                }
            }    
        } else { 
            answer = false;
        }
        return answer;
    }
}