class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean sign = true;
        if (Character.isDigit(s.charAt(0)))
            return Integer.parseInt(s);
        if (s.charAt(0) == '-')
            sign = false;
        s = s.substring(1);
        answer = Integer.parseInt(s);
        if (!sign)
             answer *= -1;   
        return answer;
    }
}