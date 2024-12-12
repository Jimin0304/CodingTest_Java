class Solution {
    public boolean is_prime_number(Long num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n, k);
        int start = 0;
        int i = start;
        for (; i < num.length(); i++) {
            if (i == start && num.charAt(i) == '0') {
                start++;
                continue ;
            }
            if (num.charAt(i) == '0') {
                String split_num = num.substring(start, i);
                if (is_prime_number(Long.parseLong(split_num)))
                    answer++;
                start = i + 1;
            }
        }
        if (start < i) {
            String split_num = num.substring(start, i);
            if (is_prime_number(Long.parseLong(split_num)))
                answer++;
        }
        
        return answer;
    }
}