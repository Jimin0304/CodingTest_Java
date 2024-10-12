class Solution {
    public int solution(int num1, int num2) {
        int minVal = 0;
        int maxVal = 100;
        boolean check = (minVal<num1 && num1<=maxVal && minVal<num2 && num2<=maxVal);
        
        int answer = 0;
        double temp = 0.0;
        
        temp = (double)(num1) / (double)(num2);
        answer = (int)(temp * 1000);
        
        return answer;
    }
}