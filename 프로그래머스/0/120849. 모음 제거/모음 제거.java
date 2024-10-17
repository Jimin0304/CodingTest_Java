class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        
        int i = 0;
        while (i < answer.length()) {
            if (answer.charAt(i) == 'a' || answer.charAt(i) == 'e' || answer.charAt(i) == 'i' || answer.charAt(i) == 'o' || answer.charAt(i) == 'u') {
                answer.deleteCharAt(i);
            } else { i++; }
        }
        
        return answer.toString();
    }
}