import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(Integer.toString(num));
        }
        
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str2.compareTo(str1);
            }
        });
        
        for (String str : list) {
            answer += str;
        }
        if (answer.startsWith("0")) answer = "0";
        
        return answer;
    }
}