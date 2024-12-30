class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            Character now = s.charAt(i);
            for (int j = 0; j < index; ) {
                now++;
                if (now > 'z')
                    now = 'a';
                if (!skip.contains(String.valueOf(now)))
                    j++;
            }
            answer.append(now);
        }
        
        return answer.toString();
    }
}