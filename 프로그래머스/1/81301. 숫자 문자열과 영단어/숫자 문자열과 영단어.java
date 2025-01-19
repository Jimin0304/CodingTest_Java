class Solution {
    public int solution(String s) {
        String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < 10; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}