class Solution {
    public String solution(int a, int b) {
        String[] week = new String[] {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cnt = -1;   // 1월 1일부터이니 1 미리 뺌
        for (int i = 0; i < a - 1; i++) {
            cnt += days[i];
        }
        cnt += b;
        
        return week[(5 + (cnt % 7)) % 7];
    }
}