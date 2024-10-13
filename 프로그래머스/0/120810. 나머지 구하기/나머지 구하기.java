class Solution {
    public int solution(int num1, int num2) {
        int minVal = 0;
        int maxVal = 100;
        boolean check = (minVal < num1) && (num1 <= maxVal) && (minVal < num2) && (num2 <= maxVal);
        
        int answer = -1;
        
        answer = num1 % num2;
        
        return answer;
    }
}