import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;      // 짧은 걸로 설정
        int length = 0;     // 긴 걸로 설정
        for (int[] size : sizes) {
            width = Math.max(width, Math.min(size[0], size[1]));
            length = Math.max(length, Math.max(size[0], size[1]));
        }
        
        return width * length;
    }
}