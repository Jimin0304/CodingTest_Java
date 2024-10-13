class Solution {
    
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        int arrlen = array.length;
        
        // 오름차순 정렬
        while (arrlen-- > 0) {
            for (int i = 0; i < arrlen; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        // Arrays.sort(array);
        
        answer = array[array.length / 2];
        
        return answer;
    }
}