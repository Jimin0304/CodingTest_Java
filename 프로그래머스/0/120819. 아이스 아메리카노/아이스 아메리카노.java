class Solution {
    public int[] solution(int money) {
        int minVal = 0;
        int maxVal = 1000000;
        boolean check = (minVal < money) && (money <= maxVal);
        
        int[] answer = new int [2];
        answer[0] = money / 5500;
        answer[1] = money % 5500; 
        
        return answer;
    }
}