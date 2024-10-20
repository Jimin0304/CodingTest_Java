class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int num = Math.abs(n - array[0]);
        
        for (int i = 1; i < array.length; i++) {
            if (num == Math.abs(n - array[i])) {
                if (answer > array[i])
                    answer = array[i];
            }
            else if (num > Math.abs(n - array[i])) {
                answer = array[i];
                num = Math.abs(n - array[i]);
            }
        }
        
        return answer;
    }
}