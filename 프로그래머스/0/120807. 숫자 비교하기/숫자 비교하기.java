class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        int minVal = 0;
        int maxVal = 10000;
        boolean check = (minVal <= num1) && (num1 <= maxVal) && (minVal <= num2) && (num2 <= maxVal);
        
        if (num1 == num2)
            answer = 1;
        else
            answer = -1;
        
        return answer;
    }
}