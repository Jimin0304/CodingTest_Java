class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        int turn = 0;
        
        for (int i = 0; i < k; i++) {
            answer = numbers[turn % len];
            turn += 2;
        }
        
        return answer;
    }
}