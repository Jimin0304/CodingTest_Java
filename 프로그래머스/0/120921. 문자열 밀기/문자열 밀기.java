class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        
        while (answer < A.length()) {
            if (sb.toString().equals(B)) 
                break ;
            String str = sb.substring(sb.length() - 1, sb.length());
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, str);
            answer++;
        }
        if (answer == A.length())
            answer = -1;
        
        return answer;
    }
}