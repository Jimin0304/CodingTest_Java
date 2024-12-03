import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int short_len = Math.min(sizes[0][0], sizes[0][1]);
        int long_len = Math.max(sizes[0][0], sizes[0][1]);
        
        for (int i = 1; i < sizes.length; i++) {
            int short_one = Math.min(sizes[i][0], sizes[i][1]);
            int long_one = Math.max(sizes[i][0], sizes[i][1]);
            
            if (short_one <= short_len && long_one <= long_len)
                continue ;
            if (short_one <= short_len && long_one > long_len)
                long_len = long_one;
            else if (short_one > short_len && long_one <= long_len) {
                if (short_one > long_len) {
                    short_len = long_len;
                    long_len = short_one;
                }
                else
                    short_len = short_one;
            }
            else {
                short_len = short_one;
                long_len = long_one;
            }
        }
        
        return short_len * long_len;
    }
}