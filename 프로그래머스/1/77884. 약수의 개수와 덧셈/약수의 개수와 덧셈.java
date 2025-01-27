class Solution {
    public int countDivisor(int num) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (i * i == num) cnt += 1;
            else if (num % i == 0)
                cnt += 2;
        }
        return cnt;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            System.out.println(countDivisor(i));
            if (countDivisor(i) % 2 == 0)
                answer += i;
            else
                answer -= i;
        }
        return answer;
    }
}