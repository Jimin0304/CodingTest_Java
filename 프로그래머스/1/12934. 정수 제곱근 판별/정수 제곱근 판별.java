class Solution {
    public long solution(long n) {
        long answer = -1;
        long x = (long)Math.sqrt(n);
        if (x * x == n)
            answer = (long)Math.pow(x + 1, 2);
        return answer;
    }
}