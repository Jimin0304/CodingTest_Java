class Solution {
    public int solution(String my_string) {
        String num = my_string.replaceAll("[A-z]", "");
        int answer = 0;
        
        for (int i = 0; i < num.length(); i++) {
            answer += (int)(num.charAt(i) - '0');
        }
        
        return answer;
    }
}