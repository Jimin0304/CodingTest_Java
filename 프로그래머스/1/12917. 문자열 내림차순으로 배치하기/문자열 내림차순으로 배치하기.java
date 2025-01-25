import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.substring(i, i + 1);
        }
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}