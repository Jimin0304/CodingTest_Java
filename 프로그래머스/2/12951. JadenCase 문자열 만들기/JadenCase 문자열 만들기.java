class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        if (Character.isLowerCase(s.charAt(0)))
            answer.append(Character.toUpperCase(s.charAt(0)));
        else
            answer.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ' && Character.isLowerCase(s.charAt(i)))
                answer.append(Character.toUpperCase(s.charAt(i)));
            else if (answer.charAt(i - 1) != ' ' && Character.isUpperCase(s.charAt(i)))
                answer.append(Character.toLowerCase(s.charAt(i)));
            else
                answer.append(s.charAt(i));
        }
        
        return answer.toString();
    }
}