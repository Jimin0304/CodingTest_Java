import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();
        int index = 0;
        
        while (index + n < my_str.length()) {
            arr.add(my_str.substring(index, index + n));
            index += n;
        }
        arr.add(my_str.substring(index));
        
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}