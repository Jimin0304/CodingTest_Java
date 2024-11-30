class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str1 = Integer.toString(arr1[i], 2);
            String str2 = Integer.toString(arr2[i], 2);
            while (str1.length() < n) {
                str1 = "0" + str1;
            }
            while (str2.length() < n) {
                str2 = "0" + str2;
            }
            
            String str = "";
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1')
                    str = str + "#";
                else
                    str = str + " ";
            }
            
            answer[i] = str;
        }
        
        return answer;
    }
}