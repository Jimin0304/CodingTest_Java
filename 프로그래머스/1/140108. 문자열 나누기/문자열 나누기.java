class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Character firstCharacter = s.charAt(0);
        int firstCnt = 1;
        int other = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == firstCharacter)
                firstCnt++;
            else
                other++;
            
            if (firstCnt == other) {
                if (i + 1 < s.length())
                    firstCharacter = s.charAt(i + 1);
                firstCnt = 0;
                other = 0;
                answer++;
            }
        }
        if (firstCnt != other)
            answer++;
        
        return answer;
    }
}