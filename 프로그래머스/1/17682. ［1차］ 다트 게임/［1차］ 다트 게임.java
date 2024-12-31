class Solution {
    public int solution(String dartResult) {
        int[] answer = new int[3];
        
        int start = 0;
        int index = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
                int score = Integer.parseInt(dartResult.substring(start, i));
                start = i + 1;
                if (dartResult.charAt(i) == 'D')
                    score = (int)Math.pow((double)score, 2);
                else if (dartResult.charAt(i) == 'T')
                    score = (int)Math.pow((double)score, 3);
                answer[index++] = score;
            }
            else if (dartResult.charAt(i) == '*') {
                for (int j = index - 1; j >= 0 && j >= index - 2; j--) {
                    answer[j] *= 2;
                }
                start = i + 1;
            }
            else if (dartResult.charAt(i) == '#') {
                answer[index - 1] *= -1;
                start = i + 1;
            }
        }
        
        return answer[0] + answer[1] + answer[2];
    }
}