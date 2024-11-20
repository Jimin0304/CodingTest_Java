import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = str1.substring(i, i + 2);
            if (temp.replaceAll("[^a-z]", "").length() == 2)
                list1.add(temp); 
        }
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < str2.length() - 1; i++) {
            String temp = str2.substring(i, i + 2);
            if (temp.replaceAll("[^a-z]", "").length() == 2)
                list2.add(temp); 
        }
        
        int diffSize = 0;
        List<String> dupList1 = new ArrayList<>(list1);
        for (String string1 : list1) {
            if (list2.contains(string1)) {
                list2.remove(string1);
                dupList1.remove(string1);
                diffSize++;
            }
        }
        
        int unionSize = diffSize + dupList1.size() + list2.size();
        double answer = 0.0;
        if (diffSize == 0 && unionSize == 0)
            answer = 65536.0;
        else
            answer = ((double)diffSize / (double)unionSize) * 65536.0;
        
        return (int)answer;
    }
}