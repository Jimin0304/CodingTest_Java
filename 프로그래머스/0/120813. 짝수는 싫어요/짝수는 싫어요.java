class Solution {
    public int[] solution(int n) {
        int len = 0;
        if (n % 2 == 1)
            len = (n / 2) + 1;
        else
            len = n / 2;
        
        int[] answer = new int[len];
        int index = 0;
        
        for (int i = 1; i <= n; i = i + 2) {
            answer[index++] = i;
        }
        
        return answer;
    }
}