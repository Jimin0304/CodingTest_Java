class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] arr = new String[array.length];
        
        for (int i = 0; i < array.length; i++) {
            arr[i] = String.valueOf(array[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '7')
                    answer++;
            }
        }
        
        return answer;
    }
}