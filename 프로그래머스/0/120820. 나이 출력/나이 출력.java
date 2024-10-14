class Solution {
    public int solution(int age) {
        int minVal = 0;
        int maxVal = 120;
        boolean check = (minVal < age) && (age <= maxVal);
        
        int answer = 2022 - age + 1;
        
        return answer;
    }
}