class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++)
                left.append(Integer.toString(i));
        }
        
        answer = left + "0";
        answer += left.reverse().toString();
        
        return answer;
    }
}