class Solution {
    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int)right - (int)left + 1];
        int index = 0;
        
        for (long i = left; i <= right; i++) {
            long y = i / n;
            long x = i % n;
            answer[index++] = Math.max(x, y) + 1;
        }
        
        return answer;
    }
}