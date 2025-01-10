import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String numbers) {
        char[] num = numbers.toCharArray();
        List<Integer> prime = new ArrayList<>();
        char[] output = new char[num.length];
        boolean[] visited = new boolean[num.length];
        
        for (int i = 1; i <= num.length; i++) {
            permutation(num, output, visited, prime, 0, num.length, i);
        }
        
        return prime.size();
    }
    
    public void permutation(char[] num, char[] output, boolean[] visited, List<Integer> prime, int depth, int n, int r) {
        if (depth == r) {
            StringBuilder sb = new StringBuilder();
            int number = 0;
            for (int i = 0; i < r; i++) {
                sb.append(output[i]);
            }
            number = Integer.parseInt(sb.toString());
            
            if (!prime.contains(number) && isPrime(number)) {  // 소수인지 확인
                prime.add(number);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = num[i];
                permutation(num, output, visited, prime, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {			// n의 제곱근까지 나누기
            if (n % i == 0) return false;
        }
        return true;
    }
}