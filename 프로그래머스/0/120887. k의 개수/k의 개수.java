class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = Integer.toString(k);
        
        for (int start = i; start <= j; start++) {
            String strI = Integer.toString(start);
            answer += strI.length() - strI.replace(strK, "").length();
        }
        
        return answer;
    }
}