class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] split = letter.split(" ");
        
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (split[i].equals(morse[j]))
                    answer.append((char)(j + 'a'));
            }
        }

        return answer.toString();
    }
}