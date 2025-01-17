class Solution {
    public int solution(int n) {
        String third = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(third);
        
        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}