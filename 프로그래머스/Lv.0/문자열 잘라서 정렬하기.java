import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> answerList = new ArrayList<>();
        
        int start, end;
        start = end = 0;

        while (end < myString.length()) {
            if (myString.charAt(end) == 'x') {
                if (start < end) { // Avoid adding empty string when 'x' appears consecutively
                    answerList.add(myString.substring(start, end));
                }
                start = end + 1;
            }
            end++;
        }
        if (start < end) { // Add the last substring if not empty
            answerList.add(myString.substring(start, end));
        }

        if (answerList.size() > 1)
            Collections.sort(answerList);
        
        String[] answerArray = answerList.toArray(new String[0]);
        return answerArray;
    }
}