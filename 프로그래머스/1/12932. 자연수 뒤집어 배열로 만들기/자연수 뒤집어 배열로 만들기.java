class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 10);
            n /= 10;
        }
        String num = sb.toString();
        int[] answer = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            answer[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        return answer;
    }
}