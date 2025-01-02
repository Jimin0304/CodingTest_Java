class Solution {
    public int fibonacci(int len) {
        if (len <= 1)
            return len;
        return fibonacci(len - 2) % 1000000007 + fibonacci(len - 1) % 1000000007 ;
    }
    
    public int solution(int n) {
        int[] fibo = new int[n + 2];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for (int i = 2; i <= n + 1; i++) {
            fibo[i] = fibo[i - 2] % 1000000007  + fibo[i - 1] % 1000000007 ;
        }

        return fibo[n + 1] % 1000000007 ;
    }
}