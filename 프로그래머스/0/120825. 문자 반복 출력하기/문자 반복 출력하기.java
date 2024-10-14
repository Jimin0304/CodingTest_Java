class Solution {
    public String solution(String my_string, int n) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                builder.append(my_string.charAt(i));
            }
        }
        
        return builder.toString();
    }
}