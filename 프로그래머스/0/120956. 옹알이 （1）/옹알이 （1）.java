class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] four = new String[]{"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i ++) {
            String word = babbling[i];
            for (int j = 0; j < 4; j++) {
                if (word.contains(four[j]))
                    word = word.replaceAll(four[j], "Z");
            }
            if (word.replaceAll("Z", "").length() == 0)
                answer++;
        }
        
        return answer;
    }
}