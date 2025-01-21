class Solution {
    public int gcd(int a, int b) {  // 유클리드 호제법
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num1 = Math.max(n, m);
        int num2 = Math.min(n, m);
        
        int gcdResult = gcd(num1, num2);
        answer[0] = gcdResult;
        answer[1] = (num1 * num2) / gcdResult;
        
        return answer;
    }
}