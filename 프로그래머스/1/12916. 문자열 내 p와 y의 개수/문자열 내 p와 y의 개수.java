class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if(Character.toLowerCase(s.charAt(i)) == 'p')
                p++;
            else if (Character.toLowerCase(s.charAt(i)) == 'y')
                y++;
        }
        
        if (p != y)
            answer = false;

        return answer;
    }
}