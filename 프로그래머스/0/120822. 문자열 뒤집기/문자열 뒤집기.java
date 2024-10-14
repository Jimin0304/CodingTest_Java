class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder string_builder = new StringBuilder();
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            string_builder.append(my_string.charAt(i));
        }
        
        answer = string_builder.toString();
        
        return answer;
    }
}