class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int[] answer = new int[2];
        int zero = 0;
        int depth = 0;
        
        while (sb.length() > 1) {
            int len = 0;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '1')
                    len++;
            }
            
            zero += sb.length() - len;
            depth++;
            
            sb = new StringBuilder();
            while (len > 0) {
                if (len % 2 == 1)
                    sb.append("1");
                else
                    sb.append("0");
                len /= 2;
            }
            sb.reverse();
        }
        
        answer[0] = depth;
        answer[1] = zero;
        
        return answer;
    }
}