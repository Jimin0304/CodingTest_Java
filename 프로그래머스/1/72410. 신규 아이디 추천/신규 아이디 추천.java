class Solution {
    public String solution(String new_id) {
        
        // step1
        new_id = new_id.toLowerCase();
        
        // step2
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        StringBuilder answer = new StringBuilder(new_id);
        
        // step3
        for (int i = 0; i < answer.length() - 1; i++) {
            if (answer.charAt(i) == '.' && answer.charAt(i + 1) == '.') {
                answer.deleteCharAt(i);   
                i--;
            }
        }
        
        // step4
        while (answer.length() > 0 && answer.charAt(0) == '.')
            answer.deleteCharAt(0);
        while (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.')
            answer.deleteCharAt(answer.length() - 1);
        
        // step5
        if (answer.length() == 0)
            answer.append("a");
        
        // step6
        if (answer.length() > 15)
            answer.delete(15, answer.length());
        while (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.')
            answer.deleteCharAt(answer.length() - 1);
        
        // step7
        if (answer.length() <= 2) {
            Character c = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer.append(c);
            }
        }   
        
        return answer.toString();
    }
}