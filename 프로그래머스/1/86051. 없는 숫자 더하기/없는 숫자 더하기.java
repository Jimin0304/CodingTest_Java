class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] num = new boolean[10];
        for (int i = 0; i < numbers.length; i++) {
            num[numbers[i]] = true;
        }
        for (int i = 0; i < num.length; i++) {
            if (!num[i])
                answer += i;
        }
        return answer;
    }
}